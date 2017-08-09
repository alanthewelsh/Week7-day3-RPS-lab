package com.example.alanmclarney.rock_paper_scissors;

/**
 * Created by alanmclarney on 09/08/2017.
 */

public class Game {

    private String select;

    public Game(String select){
        this.select = select;
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }
}
