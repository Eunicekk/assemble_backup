package com.example.assemble.controller.study;

import com.example.assemble.domain.study.StudyTalkDTO;
import com.example.assemble.domain.study.StudyTalkVO;
import com.example.assemble.domain.user.UserVO;
import com.example.assemble.service.study.StudyTalkService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequiredArgsConstructor
@RequestMapping("/study/talk/*")
public class StudyTalkController {
    private final StudyTalkService studyTalkService;

    public UserVO getSessionUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserVO user = null;
        if(session != null) {
            user = (UserVO)session.getAttribute("user");
        }
        return user;
    }

    @GetMapping("/add")
    public StudyTalkDTO add(StudyTalkVO studyTalkVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return null;
        studyTalkService.register(studyTalkVO);
        StudyTalkDTO studyTalkDTO = new StudyTalkDTO(studyTalkVO, sessionUser.getUserNickname());
        return studyTalkDTO;
    }
    @GetMapping("/remove")
    public void remove(Long studyTalkId) {
        studyTalkService.delete(studyTalkId);
    }

}
