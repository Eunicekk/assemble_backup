package com.example.assemble.repository.user;

import com.example.assemble.domain.user.UserVO;
import com.example.assemble.mapper.user.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class UserDAO {
    private final UserMapper userMapper;

    // 회원가입
    public void setUserVO(UserVO userVO){
        userMapper.insert(userVO);
    }

    // 로그인
    public UserVO getUserVO(UserVO userVO){
        return userMapper.select(userVO);
    }

    // 계정찾기
    public UserVO findUserVO(UserVO userVO){
        return userMapper.selectUser(userVO);
    }

    // 아이디로 정보조회
    public UserVO findUserById(String userId){
        return userMapper.selectUserById(userId);
    }

    public UserVO getUserVOById(String userId) {
        return userMapper.selectById(userId);
    }

    // 비밀번호 조회
    public String findPassword(String userId){
        return userMapper.selectPassword(userId);
    }

    // 아이디 중복검사
    public int checkId(String userId){
        return userMapper.checkId(userId);
    }

}
