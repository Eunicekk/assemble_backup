package com.example.assemble.domain.Board;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Clob;

@Component
@Data
public class BoardVO {
    private Long boardId;
    private String boardTitle;
    private Clob boardContent;
    private String boardRegisterDate;
    private String boardUpdateDate;
    private Long boardViews;
    private String userId;

}

//    BOARD_ID NUMBER CONSTRAINT P_BOARD PRIMARY KEY,
//    BOARD_TITLE VARCHAR2(1000) NOT NULL,
//    BOARD_CONTENT CLOB NOT NULL,
//    BOARD_REGISTER_DATE DATE DEFAULT SYSDATE,
//    BOARD_UPDATE_DATE DATE DEFAULT SYSDATE,
//    BOARD_VIEWS NUMBER DEFAULT 0,
//        USER_ID VARCHAR2(1000) NOT NULL