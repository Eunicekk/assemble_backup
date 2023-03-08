package com.example.assemble.controller.study;

import com.example.assemble.domain.study.JoinStudyVO;
import com.example.assemble.domain.study.StudyTalkDTO;
import com.example.assemble.domain.study.StudyTalkVO;
import com.example.assemble.domain.user.UserVO;
import com.example.assemble.service.study.JoinStudyService;
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
    private final JoinStudyService joinStudyService;

    // 세션 유저 정보 가져오기
    public UserVO getSessionUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserVO user = null;
        if(session != null) {
            user = (UserVO)session.getAttribute("user");
        }
        return user;
    }

    // 해당 유저가 그룹원이 맞는지 확인
    public String checkUser(String userId, Long studyId) {
        JoinStudyVO joinStudyVO = new JoinStudyVO();
        joinStudyVO.setUserId(userId);
        joinStudyVO.setStudyId(studyId);

        String check = joinStudyService.checkUser(joinStudyVO).getUserId();
        return check;
    }

    // 스터디톡 보내기
    @GetMapping("/add")
    public StudyTalkDTO add(StudyTalkVO studyTalkVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return null;
        String check = checkUser(sessionUser.getUserId(), studyTalkVO.getStudyId());
        if(check == null) return null;

        studyTalkService.register(studyTalkVO);
        StudyTalkDTO studyTalkDTO = new StudyTalkDTO(studyTalkVO, sessionUser.getUserNickname());
        return studyTalkDTO;
    }
    // 자신이 보낸 스터디톡 삭제
    @GetMapping("/remove")
    public String remove(Long studyTalkId, Long studyId, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return null;
        String check = checkUser(sessionUser.getUserId(), studyId);
        if(check == null) return null;

        studyTalkService.delete(studyTalkId);
        return "success";
    }
}
