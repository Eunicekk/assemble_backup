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

    public UserVO getSessionUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserVO user = null;
        if(session != null) {
            user = (UserVO)session.getAttribute("user");
        }
        return user;
    }

    @GetMapping("/notice")
    public String setNotice(StudyVO studyVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return null;
        if(sessionUser.getUserId() != studyVO.getStudyLeader()) return null;
        studyService.updateStudyNotice(studyVO);

        return studyVO.getStudyNotice();
    }

    @PostMapping("/leader")
    public String setLeader(StudyVO studyVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return null;
        if(sessionUser.getUserId() != studyVO.getStudyLeader()) return null;
        studyService.updateStudyLeader(studyVO);

        return studyVO.getStudyLeader();
    }
}
