package com.example.assemble.service.user;

import com.example.assemble.repository.user.MyPageDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("myPage")
@Primary
public class MyPageServiceImpl {
    private final MyPageDAO myPageDAO;
}
