package com.example.assemble.domain.scrap;

import java.io.Serializable;

public class ScrapId implements Serializable{
    private int user;
    private int board;

    public ScrapId(){}
    public ScrapId(int user, int board){
        super();
        this.user = user;
        this.board = board;
    }
}
