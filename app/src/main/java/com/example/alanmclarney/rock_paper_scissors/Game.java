package com.example.alanmclarney.rock_paper_scissors;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by alanmclarney on 09/08/2017.
 */

public class Game {

    private String select;
    private ArrayList<String> computer;

    public Game(){
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

    public String getAnswersAsIndex(int index){
        return computer.get(index);
    }

    public String getComputerGo(){
        Random rand = new Random();
        int listSize = getLength();
        int index = rand.nextInt(listSize);
        return getAnswersAsIndex(index);
    }

    public String rock(){
        String user = "Rock";
        String computerGo = this.getComputerGo();
        String output = null;

        if (computerGo.equals(user)){
            output = "Android chooses Rock, Its a Draw!";
        }else if (computerGo.equals("Paper")){
            output = "Android chooses Paper, You loose!";
        }else if (computerGo.equals("Scissors")){
            output = "Android chooses Scissors, You win!";
        }
        return output;}

    public String paper() {
        String user = "Paper";
        String computerGo = this.getComputerGo();
        String output = null;

        if (computerGo.equals(user)) {
            output = "Android chooses Paper, Its a Draw!";
        } else if (computerGo.equals("Scissors")) {
            output = "Android chooses Scissors, You loose!";
        } else if (computerGo.equals("Rock")) {
            output = "Android chooses Rock, You win!";
        }
        return output;}

    public String scissors() {
        String user = "scissors";
        String computerGo = this.getComputerGo();
        String output = null;

        if (computerGo.equals(user)) {
            output = "Android chooses Scissors, Its a Draw!";
        } else if (computerGo.equals("Rock")) {
            output = "Android chooses Rock, You loose!";
        } else if (computerGo.equals("Paper")) {
            output = "Android chooses Paper, You win!";
        }
        return output;}
    }

