package com.example.assemble.domain.study;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class StudyTalkDTO {
    private Long studyTalkId;
    private Long studyId;
    private String userId;
    private String userNickname;
    private String studyTalkContent;
    private String studyTalkRegisterDate;

    public StudyTalkDTO(StudyTalkVO studyTalkVO, String userNickname) {
        this.studyTalkId = studyTalkVO.getStudyTalkId();
        this.studyId = studyTalkVO.getStudyId();
        this.userId = studyTalkVO.getUserId();
        this.userNickname = userNickname;
        this.studyTalkContent = studyTalkVO.getStudyTalkContent();
        this.studyTalkRegisterDate = studyTalkVO.getStudyTalkRegisterDate();
    }
}
