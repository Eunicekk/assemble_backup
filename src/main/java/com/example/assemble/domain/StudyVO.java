package com.example.assemble.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@Data
@NoArgsConstructor
public class StudyVO {
    private Long studyId;
    private String studyName;
    private boolean studyOnline;
    private String studyArea;
    private String studyTopic;
    private String studyNotice;
    private boolean studySearch;
    private boolean studyComplete;
    private String studyRegisterDate;
    private String studyUpdateDate;

    public StudyVO(String studyName, boolean studyOnline, String studyArea, String studyTopic, boolean studySearch){
        this.studyName = studyName;
        this.studyOnline = studyOnline;
        this.studyArea = studyArea;
        this.studyTopic = studyTopic;
        this.studySearch = studySearch;
    }
}
