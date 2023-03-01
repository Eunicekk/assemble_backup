package com.example.assemble.domain.study;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@NoArgsConstructor
@Component
public class StudyTalkVO {
    private Long studyTalkId;
    private Long studyId;
    private String userId;
    private String studyTalkContent;
    private String studyTalkRegisterDate;
}
