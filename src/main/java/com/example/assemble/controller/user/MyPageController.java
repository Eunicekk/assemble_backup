package com.example.assemble.controller.user;

import com.example.assemble.domain.user.UserVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequiredArgsConstructor
public class MyPageController {

//    @GetMapping("/myPage")
//    public void getInfoById(Model model, HttpServletRequest request){
//        HttpSession session = request.getSession();
//        String userId = null;
//        UserVO userVO = new UserVO();
//        if(session != null) {
//            userId = (String)session.getAttribute("userId");
//        }
//        if(userId != null) {
//            userVO = userService.getUserVOById(userId);
//        }
//        model.addAttribute("userVO", userVO);
//
//    }

//    @PostMapping("/myPage")
//    public RedirectView updateInfo(UserVO userVO, RedirectAttributes redirectAttributes){
//        userService.updateInfo(userVO);
//
//        return new RedirectView("/myPage");
//    }
}
