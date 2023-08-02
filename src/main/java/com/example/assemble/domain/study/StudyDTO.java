package com.example.assemble.domain.study;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Data
@NoArgsConstructor
public class StudyDTO {
    private Long studyId;
    private String studyName;
    private Boolean studyOnline;
    private String studyArea;
    private String studyTopic;
    private String studyNotice;
    private Boolean studyComplete;
    private String studyLeader;
    private String studyMaxNumber;
    private String studyCurrentNumber;
    private String studyRecruitment;
    private String studyRegisterDate;
    private String studyUpdateDate;
    private String[] topics;
    private Integer page = 1;
    private String userId;




    public StudyDTO(String studyName, Boolean studyOnline, String studyArea, String studyTopic){
        this.studyName = studyName;
        this.studyOnline = studyOnline;
        this.studyArea = studyArea;
        this.studyTopic = studyTopic;
    }
}
