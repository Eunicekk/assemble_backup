package com.example.assemble.controller.user;

import com.example.assemble.domain.user.UserVO;
import com.example.assemble.service.user.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Properties;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @GetMapping("/signup")
    public String signup(UserVO userVO) {
        return "/user/signup";
    }

    @PostMapping("/signup")
    public RedirectView signupComplete(UserVO userVO) {
        userService.signup(userVO);
        return new RedirectView("/login");
    }

    @GetMapping("/login")
    public String login(UserVO userVO) {
        return "/user/login";
    }

    @PostMapping("/login")
    public RedirectView login(UserVO userVO, Model model, HttpServletRequest request) {
        HttpSession session = request.getSession();
        if(userService.login(userVO)) {
            userVO = userService.findUserById(userVO.getUserId());
            session.setAttribute("userVO", userVO);
        }
        return new RedirectView("/");
    }

    @GetMapping("/logout")
    public RedirectView logout(HttpServletRequest request) {
        HttpSession session = request.getSession();
        session.invalidate();
        return new RedirectView("/");
    }

//    @GetMapping("/findUser")
//    public String findUser (Model model, UserVO userVO){
//        return "/user/findUser";
//    }
//
//    @PostMapping("/findUser")
//    public String checkUser (Model model, UserVO userVO){
//        UserVO findUserVO = userService.findUser(userVO);
//        model.addAttribute("user", userService.findUser(userVO));
//
//        String recipientEmail = userVO.getUserEmail();
//        String userName = userVO.getUserName();
//        String userId = findUserVO.getUserId();
//        String userPassword = findUserVO.getUserPassword();
//
//        // 1. 발신자의 메일 계정과 비밀번호 설정
//        final String user = "aaa@gmail.com";
//        final String password = "1234";
//
//        // 2. Property에 SMTP 서버 정보 설정
//        Properties prop = new Properties();
//        prop.put("mail.smtp.auth", true);
//        prop.put("mail.smtp.starttls.enable", true);
//        prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", 587);
//
//        // 3. SMTP 서버정보와 사용자 정보를 기반으로 Session 클래스의 인스턴스 생성
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication(user, password);
//                    }
//                }
//        );
//
//        // 4. Message 클래스의 객체를 사용하여 수신자와 내용, 제목의 메시지를 작성한다.
//        // 5. Transport 클래스를 사용하여 작성한 메세지를 전달한다.
//
//        MimeMessage message = new MimeMessage(session);
//        try {
//            message.setFrom(new InternetAddress(user));
//
//            // 수신자 메일 주소
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(recipientEmail));
//
//            // Subject
//            message.setSubject("assemble에서 계정 정보를 알려드립니다.");
//
//            // Text
//            String emailContent = userName + "님의 아이디와 패스워드를 알려드립니다.\n\n";
//            emailContent += "아이디: " + userId + "\n";
//            emailContent += "패스워드: " + userPassword + "\n";
//            message.setText(emailContent);
//
//            Transport.send(message);    // send message
//        } catch (AddressException e) {
//            e.printStackTrace();
//        } catch (MessagingException e) {
//            e.printStackTrace();
//        }
//        return "/user/checkUser";
//    }
}