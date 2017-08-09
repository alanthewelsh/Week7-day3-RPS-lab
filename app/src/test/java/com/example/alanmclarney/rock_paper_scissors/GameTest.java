package com.example.alanmclarney.rock_paper_scissors;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


public class GameTest {

    Game game;


    @Before
    public void before() {
        game = new Game("Rock");
    }
    @Test
    public void testGetInput(){
        assertEquals("Rock", game.getSelect());
    }
    @Test
    public void setUpAnswersHasAnswers(){
        assertEquals(3, game.getLength());
    }


}
