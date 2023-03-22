package com.example.assemble.controller.study;

import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;
import com.example.assemble.service.study.StudyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping("/study/*")
public class StudyRestController {
    private final StudyService studyService;

    // 세션 유저 정보 가져오기
    public UserVO getSessionUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserVO user = null;
        if(session != null) {
            user = (UserVO)session.getAttribute("user");
        }
        return user;
    }

    // 스터디 공지사항 수정(스터디장만 가능)
    @GetMapping("/notice")
    public String setNotice(StudyVO studyVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return null;
        if(sessionUser.getUserId() != studyVO.getStudyLeader()) return null;
        studyService.updateStudyNotice(studyVO);

        return studyVO.getStudyNotice();
    }

    // 스터디장 변경(스터디장만 가능)
    @PostMapping("/leader")
    public String setLeader(StudyVO studyVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return null;
        if(sessionUser.getUserId() != studyVO.getStudyLeader()) return null;
        studyService.updateStudyLeader(studyVO);

        return studyVO.getStudyLeader();
    }
}
