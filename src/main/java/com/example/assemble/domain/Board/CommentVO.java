package com.example.assemble.domain.Board;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.sql.Clob;

@Component
@Data
public class CommentVO {
    private Long commentId;
    private Clob commentContent;
    private String commentRegisterDate;
    private String commentUpdateDate;
    private Long commentWarning;
    private String boardId;
    private String userId;
}


//    COMMENT_ID NUMBER CONSTRAINT P_COMMENT PRIMARY KEY,
//    COMMENT_CONTENT CLOB NOT NULL,
//    COMMENT_REGISTER_DATE DATE DEFAULT SYSDATE,
//    COMMENT_UPDATE_DATE DATE DEFAULT SYSDATE,
//    COMMENT_WARNING NUMBER DEFAULT 0,
//        BOARD_ID NUMBER NOT NULL,
//        USER_ID VARCHAR2(1000) NOT NULL,
//        CONSTRAINT F_COMMENT_BOARD FOREIGN KEY(BOARD_ID) REFERENCES TBL_BOARD2(BOARD_ID),
//        CONSTRAINT F_COMMENT_USER FOREIGN KEY(USER_ID) REFERENCES TBL_USER(USER_ID)