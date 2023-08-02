package com.example.assemble.service.user;

import com.example.assemble.domain.user.UserFileDTO;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

public interface UserFileService {
    // 프로필 이미지 추가
    public void register(UserFileDTO userFileDTO);

    // 프로필 이미지 삭제
    public void remove(String userId);

    // 프로필 이미지 선택
    public UserFileDTO select(String userId);

    // 프로필 이미지 저장
    public UserFileDTO saveFile(MultipartFile file) throws IOException;

    // 프로필 이미지 DB등록
    public void registerAndSaveFiles(MultipartFile multipartFile, String userId) throws IOException;
}
