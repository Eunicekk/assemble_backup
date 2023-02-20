package com.example.assemble.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class UserVO {
    private String userId;
    private String userPassword;
    private String userNickname;
    private String userEmail;
    private String userName;
    private String userRegisterDate;
    private String userUpdateDate;
    private String userProfile;
    private boolean userAdmin;
}
