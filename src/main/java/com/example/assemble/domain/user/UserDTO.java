package com.example.assemble.domain.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class UserDTO {
    private String userId;
    private String userPassword;
    private String userNickname;
    private String userEmail;
    private String userName;
    private String userRegisterDate;
    private String userUpdateDate;
    private String userProfile;
    private boolean userAdmin;
    private int rating;
}
