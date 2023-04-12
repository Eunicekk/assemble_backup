package com.example.assemble.domain.study;

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
    private boolean joinStudyJoin;
    private String joinStudyRegisterDate;
    private String joinStudyUpdateDate;

    public JoinStudyVO(Long studyId, String userId) {
        this.studyId = studyId;
        this.userId = userId;
    }
}
