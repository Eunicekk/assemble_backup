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

    @PostMapping("/check/login")
    public Boolean login(UserVO userVO){
        Boolean check = userService.login(userVO);
        return check;
    }

//    @PostMapping("/check/login")
//    public ResponseEntity<String> login(@RequestBody UserVO userVO) {
//        boolean loginSuccess = userService.login(userVO);
//
//        if (loginSuccess) {
//            return ResponseEntity.ok("로그인 성공");
//        } else {
//            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("로그인 실패");
//        }
//    }
}
