package com.example.assemble.domain;

import lombok.Builder;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NoticeVO {
    private Long noticeId;
    private String noticeTitle;
    private String noticeContent;
    private String noticeImg;
    private String noticeDate;

}


//    CREATE TABLE TBL_NOTICE(
//        NOTICE_ID NUMBER CONSTRAINTS PK_NOTICE PRIMARY KEY,
//        NOTICE_TITLE VARCHAR2(100),
//    NOTICE_CONTENT VARCHAR2(3000),
//    NOTICE_IMG VARCHAR2(100),
//    NOTICE_DATE DATE DEFAULT sysdate
//);