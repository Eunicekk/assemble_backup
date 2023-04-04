package com.example.assemble.controller.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.service.study.JoinStudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class JoinStudyController {
    private final JoinStudyService joinStudyService;

    @PutMapping("/study/join")
    public void sendRequest(JoinStudyVO joinStudyVO) {
        System.out.println(joinStudyVO);
        joinStudyService.request(joinStudyVO);
    }
}
