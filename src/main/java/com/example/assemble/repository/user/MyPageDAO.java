package com.example.assemble.repository.user;

import com.example.assemble.mapper.user.MyPageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

@Repository
@RequiredArgsConstructor
public class MyPageDAO {
    private final MyPageMapper myPageMapper;
}
