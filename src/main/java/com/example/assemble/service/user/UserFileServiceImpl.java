package com.example.assemble.service.user;

import com.example.assemble.domain.user.UserFileDTO;
import com.example.assemble.repository.user.UserFileDAO;
import lombok.RequiredArgsConstructor;
import net.coobird.thumbnailator.Thumbnailator;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
@Qualifier("userFile")
@Primary
public class UserFileServiceImpl implements UserFileService {
    private final UserFileDAO userFileDAO;

    @Value("${file.dir}")
    private String fileDir;

    // 프로필 이미지 추가
    public void register(UserFileDTO userFileDTO){
        if(userFileDTO == null){ throw new IllegalArgumentException("파일 정보가 없습니다.");}
        userFileDAO.register(userFileDTO);
    }

    // 프로필 이미지 삭제
    public void remove(String userId){
        if (userId == null){
            throw new IllegalArgumentException("이용자 아이디가 없습니다.");
        }
        userFileDAO.remove(userId);
    }

    // 프로필 이미지 선택
    public UserFileDTO select(String userId){
        return userFileDAO.select(userId);
    }

    // 파일 저장
    public UserFileDTO saveFile(MultipartFile file) throws IOException {
        // 사용자가 올린 파일 이름(확장자를 포함)
        String originName = file.getOriginalFilename();
        // 파일 이름에 공백이 들어오면 처리해준다.
        originName = originName.replaceAll("\\s+", "");

        // 파일 이름에 붙여줄 uuid 생성(파일이름 중복이 나오지 않게 처리)
        UUID uuid = UUID.randomUUID();

        // uuid와 파일이름을 합쳐준다.
        String sysName = uuid.toString() + "_" + originName;

        File uploadPath = new File(fileDir, getUploadPath());

        // 경로가 존재하지 않는다면(폴더가 없다면) 경로에 필요한 폴더를 생성한다.
        if(!uploadPath.exists()){
            uploadPath.mkdirs();
        }

        // 전체 경로와 파일이름을 연결한다.
        File uploadFile = new File(uploadPath, sysName);

        // 매개변수로 받은 파일을 우리가 만든 경로와 이름으로 저장한다.
        // transferTo(경로)
        // MultipartFile객체를 실제로 저장시킨다.
        // 저장시킬 경로와 이름을 매개변수로 넘겨주면 된다.
        file.transferTo(uploadFile);

        // 썸네일 저장처리
        // 이미지 파일인 경우에만 처리하는 조건식
        if(Files.probeContentType(uploadFile.toPath()).startsWith("image")){
            FileOutputStream out = new FileOutputStream(new File(uploadPath, "th_"+sysName));
            Thumbnailator.createThumbnail(file.getInputStream(), out, 300, 300);
            out.close();
        }

        // boardNumber를 제외한 모든 정보를 가진 FileDto를 반환한다.
        UserFileDTO userFileDTO = new UserFileDTO();
        userFileDTO.setUserFileUuid(uuid.toString());
        userFileDTO.setUserFileName(originName);
        userFileDTO.setUserFileUploadPath(getUploadPath());

        return userFileDTO;
    }

    // 파일 리스트를 DB등록 및 저장 처리
    public void registerAndSaveFiles(MultipartFile file, String userId) throws IOException{
        if(file == null || file.isEmpty()){
            return;
        }
        UserFileDTO userFileDTO = saveFile(file);

        userFileDTO.setUserId(userId);
        register(userFileDTO);
    }

    // 현재 날짜 구하기 (파일이 저장되는 경로를 현재 날짜로 설정하기 위함)
    private String getUploadPath(){
        return new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    }
}
