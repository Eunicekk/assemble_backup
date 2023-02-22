package com.example.assemble.controller;

import com.example.assemble.domain.NoticeVO;
import com.example.assemble.service.NoticeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/notice/*")
@RequiredArgsConstructor
public class NoticeController {

    private final NoticeService noticeService;


    // 공지글 목록
    @GetMapping("/list")
    public void getNotice(Model model){
        model.addAttribute("notices", noticeService.getList());
    }

    // 공지글 추가
    @GetMapping("/write")
    public void writeNotice(Model model){
        model.addAttribute("noticeVO", new NoticeVO());
    }

    @PostMapping("/write")
    public RedirectView writeNotice(NoticeVO noticeVO){
        noticeVO.setNoticeImg("null");
        noticeService.add(noticeVO);
        return new RedirectView("/notice/list");
    }

    // 공지글 삭제
    @GetMapping("/delete")
    public RedirectView delete(Long noticeId){
        noticeService.delete(noticeId);
        return new RedirectView("/notice/list");
    }

    // 공지글 상세보기
    @GetMapping(value = {"/read", "/update"})
    public void read(Long noticeId, Model model){
        model.addAttribute("notice", noticeService.getNotice(noticeId));
    }

    // 공지글 수정
    @PostMapping("/update")
    public RedirectView update(NoticeVO noticeVO, RedirectAttributes redirectAttributes){
        noticeService.updateNotice(noticeVO);
        redirectAttributes.addAttribute("noticeId", noticeVO.getNoticeId());
        return new RedirectView("/notice/read");
    }

}
