package com.app.dice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DiceAppTest {
    @Test
    public void diceRollTest1() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{1,1,1,3,4});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : "+score);
        assertTrue(score == 1040);
    }

    @Test
    public void diceRollTest2() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{1,1,1,1,1});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : "+score);
        assertTrue(score == 1200);
    }

}