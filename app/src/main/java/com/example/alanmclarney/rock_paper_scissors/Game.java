package com.example.alanmclarney.rock_paper_scissors;

import java.util.ArrayList;

/**
 * Created by alanmclarney on 09/08/2017.
 */

public class Game {

    private String select;
    private ArrayList<String> computer;

    public Game(String select){
        this.select = select;
        setUpAnswers();
    }
    

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    private void setUpAnswers(){
        computer = new ArrayList<String>();
        String array[] = {"Rock", "Paper", "Scissors"};
        for (int i=0; i < 3; i++){
            computer.add(array[i]);
        }
    }

    public int getLength(){
        return computer.size();
    }
}
