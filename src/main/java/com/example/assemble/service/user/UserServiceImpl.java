package com.example.assemble.service.user;

import com.example.assemble.domain.user.UserVO;
import com.example.assemble.repository.user.UserDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("user")
@Primary
public class UserServiceImpl implements UserService {
    private final UserDAO userDAO;

    // 회원가입
    @Override
    public void signup(UserVO userVO){
        userDAO.setUserVO(userVO);
    }

    // 로그인
    @Override
    public boolean login(UserVO userVO){
        return (userDAO.getUserVO(userVO) != null) ? true : false;
    }

    // 계정찾기
    @Override
    public UserVO findUser(UserVO userVO){
        return userDAO.findUserVO(userVO);
    }

    // 아이디로 정보조회
    @Override
    public UserVO findUserById(String userId){
        return userDAO.findUserById(userId);
    }
}
