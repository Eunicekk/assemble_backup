package com.example.assemble.controller;


import com.example.assemble.domain.user.UserVO;
import com.example.assemble.domain.Board.BoardPageDTO;
import com.example.assemble.service.scrap.ScrapService;
import com.example.assemble.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class ScrapController {
    private final ScrapService scrapService;
    private final UserService userService;

    @GetMapping("/activity/scrappedBoard")
    public void getScrappedBoard(Integer page, String userId, Model model, HttpServletRequest request) {
        if(page == null) page = 1;
        boolean userCheck2 = false;
        HttpSession session = request.getSession();
        String sessionUserId = null;

        if(session != null){
            sessionUserId = (String)session.getAttribute("userId");
            if(sessionUserId != null) {
                if (sessionUserId.equals(userId)) userCheck2 = true;
            }
        }

        UserVO userVO = userService.getUserVOById(userId);

        model.addAttribute("userCheck2", userCheck2);
        model.addAttribute("userVO", userVO);
        BoardPageDTO pbt = new BoardPageDTO().createPageBoardDTO(page, 255);
        model.addAttribute("pagination", pbt);
        model.addAttribute("scraps", scrapService.getScrappedBoard(userVO.getUserId(), page));
    }
}