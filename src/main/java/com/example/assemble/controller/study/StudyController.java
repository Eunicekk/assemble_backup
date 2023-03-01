package com.example.assemble.controller.study;

import com.example.assemble.domain.study.StudyVO;
import com.example.assemble.domain.user.UserVO;
import com.example.assemble.service.study.JoinStudyService;
import com.example.assemble.service.study.StudyService;
import com.example.assemble.service.study.StudyTalkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
@RequestMapping("/study")
public class StudyController {
    private final StudyService studyService;
    private final StudyTalkService studyTalkService;
    private final JoinStudyService joinStudyService;

    public UserVO getSessionUser(HttpServletRequest request) {
        HttpSession session = request.getSession();
        UserVO user = null;
        if(session != null) {
            user = (UserVO)session.getAttribute("user");
        }
        return user;
    }

    @GetMapping("/list")
    public String getStudyList(Model model, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return "/login";
        model.addAttribute("studyList", joinStudyService.studyList(sessionUser.getUserId()));
        return "/study/list";
    }

    @GetMapping("/")
    public void getStudy(StudyVO studyVO) {
        studyVO = studyService.viewDetail(studyVO.getStudyId());
    }

    @GetMapping("/add")
    public String add(StudyVO studyVO, UserVO userVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return "/login";
        return "/study/add";
    }
    @PostMapping("/add")
    public RedirectView add(StudyVO studyVO) {
        studyService.createStudy(studyVO);
        return new RedirectView("/study/list");
    }
    @GetMapping("/update")
    public String update(StudyVO studyVO, HttpServletRequest request) {
        UserVO sessionUser = getSessionUser(request);
        if(sessionUser == null) return "/login";
        return "/study/update";
    }
    @PostMapping("/update")
    public String update(StudyVO studyVO, Model model) {
        studyService.updateStudy(studyVO);

        return "/";
    }
    @GetMapping("/talk")
    public void talk(Long studyId, Model model) {
        model.addAttribute("talks", studyTalkService.viewTalkList(studyId));
    }
}
