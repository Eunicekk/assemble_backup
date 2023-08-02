package com.example.assemble.repository.user;

import com.example.assemble.domain.user.UserFileDTO;
import com.example.assemble.mapper.user.UserFileMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Repository
@RequiredArgsConstructor
public class UserFileDAO {
    private final UserFileMapper userFileMapper;

    // 프로필 이미지 추가
    public void register(UserFileDTO userFileDTO){
        userFileMapper.insert(userFileDTO);
    }

    // 프로필 이미지 삭제
    public void remove(String userId){
        userFileMapper.delete(userId);
    }

    // 프로필 이미지 선택
    public UserFileDTO select(String userId){
        return userFileMapper.select(userId);
    }

}
