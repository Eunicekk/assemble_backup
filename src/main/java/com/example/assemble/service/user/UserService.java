package com.example.assemble.service.user;

import com.example.assemble.domain.user.UserVO;
import org.springframework.web.multipart.MultipartFile;

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

    // 비밀번호 조회
    public String findPassword(String userId);

    // 아이디 중복검사
    public boolean checkId(String userId);

    // 닉네임 중복검사
    public boolean checkNickname(String userNickname);

    // 회원정보 수정
    public void modify(UserVO userVO, MultipartFile multipartFile);

    // 회원정보 삭제
    public void remove(String userId);
}
