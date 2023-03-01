package com.example.assemble.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BoardPageDTO {

    private int startPage;
    private int endPage;
    private int realEnd;
    private boolean prev, next;
    private int total;
    private int page;

    public BoardPageDTO

}
