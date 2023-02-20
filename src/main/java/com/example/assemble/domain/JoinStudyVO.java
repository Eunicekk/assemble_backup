package com.example.assemble.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class JoinStudyVO {
    private Long joinStudyId;
    private Long studyId;
    private String userId;
    private String joinStudyRegisterDate;
    private String joinStudyUpdateDate;
}
