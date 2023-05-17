package com.example.assemble.service.user;

import com.example.assemble.domain.user.UserVO;

public interface UserService {
    // 회원가입
    public void signup(UserVO userVO);

    // 로그인
    public boolean login(UserVO userVO);

    // 계정찾기
    public UserVO findUser(UserVO userVO);

    // 아이디로 정보조회
    public UserVO findUserById(String userId);

    public UserVO getUserVOById(String userId);
}
