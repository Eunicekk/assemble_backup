package com.example.assemble.domain.user;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
@Data
public class UserFileDTO {
    private int userFileNumber;
    private String userFileName;
    private String userFileUploadPath;
    private String userFileUuid;
    private String userId;
}
