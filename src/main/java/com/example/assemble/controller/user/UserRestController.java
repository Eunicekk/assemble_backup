package com.example.assemble.controller.user;

import com.example.assemble.domain.user.UserVO;
import com.example.assemble.service.user.UserService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserRestController {
    private final UserService userService;

    @GetMapping("/check/checkId")
    public Boolean checkId(@RequestParam("userId")String userId){
        return userService.checkId(userId);
    }

    @GetMapping("/check/checkNickname")
    public Boolean checkNickname(@RequestParam("userNickname")String userNickname){
        return userService.checkNickname(userNickname);
    }

    @PostMapping("/check/login")
    public Boolean login(UserVO userVO){
        Boolean check = userService.login(userVO);
        return check;
    }

}
