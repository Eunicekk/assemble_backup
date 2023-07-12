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
    public void signup(UserVO userVO){
        userDAO.setUserVO(userVO);
    }

    // 로그인
    public boolean login(UserVO userVO){
        return (userDAO.getUserVO(userVO) != null) ? true : false;
    }

    // 계정찾기
    public UserVO findUser(UserVO userVO){
        return userDAO.findUserVO(userVO);
    }

    // 아이디로 정보조회
    public UserVO findUserById(String userId){
        return userDAO.findUserById(userId);
    }

    public UserVO getUserVOById(String userId) {
        return userDAO.getUserVOById(userId);
    }

    // 비밀번호 조회
    public String findPassword(String userId) {
        return userDAO.findPassword(userId);
    }

    // 아이디 중복검사
    public boolean checkId(String userId) {
        return (userDAO.checkId(userId) < 1) ? true : false;
    }

    // 닉네임 중복검사
    public boolean checkNickname(String userNickname) {
        return (userDAO.checkNickname(userNickname) < 1) ? true : false;
    }

    // 회원정보 수정
    public void modify(UserVO userVO){
        userDAO.modify(userVO);
    }

    // 회원정보 삭제
    public void remove(String userId){
        userDAO.remove(userId);
    }
}
