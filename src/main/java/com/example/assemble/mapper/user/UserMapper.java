package com.example.assemble.mapper.user;

import com.example.assemble.domain.user.UserVO;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    // 회원가입
    public void insert(UserVO userVO);

    // 로그인
    public UserVO select(UserVO userVO);

    // 계정찾기
    public UserVO selectUser(UserVO userVO);

    // 아이디로 정보조회
    public UserVO selectUserById(String userId);

    public UserVO selectById(String userId);

    // 비밀번호 조회
    public String selectPassword(String userId);

    // 아아디 중복 검사
    public int checkId(String userId);

}
