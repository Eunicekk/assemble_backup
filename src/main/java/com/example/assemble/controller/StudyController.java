package com.example.assemble.controller;

import com.example.assemble.domain.StudyVO;
import com.example.assemble.domain.UserVO;
import com.example.assemble.service.StudyService;
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

    public String sessionUserId(HttpServletRequest request) {
        HttpSession session = request.getSession();
        String userId = "";
        if(session != null) {
            userId = (String)session.getAttribute("userId");
        }
        return userId;
    }

    @GetMapping("/list")
    public String getStudyList(Model model, HttpServletRequest request) {
        if(sessionUserId(request) == null) return "/login";
        model.addAttribute("studyList", studyService.studyList(sessionUserId(request)));
        return "/study/list";
    }

    @GetMapping("/")
    public void getStudy(StudyVO studyVO) {
        studyVO = studyService.viewDetail(studyVO.getStudyId());
    }

    @GetMapping("/add")
    public String add(StudyVO studyVO, UserVO userVO, HttpServletRequest request) {
        if(sessionUserId(request) == "") return "/login";
        return "/study/add";
    }
    @PostMapping("/add")
    public RedirectView add(StudyVO studyVO) {
        studyService.createStudy(studyVO);
        return new RedirectView("/study/list");
    }
    @GetMapping("/update")
    public String update(StudyVO studyVO, HttpServletRequest request) {
        if(sessionUserId(request) == "") return "/login";
        return "/study/update";
    }
    @PostMapping("/update")
    public String update(StudyVO studyVO, Model model, HttpServletRequest request) {
        studyService.updateStudy(studyVO);
        model.addAttribute("userId", sessionUserId(request));

        return "/";
    }
}
