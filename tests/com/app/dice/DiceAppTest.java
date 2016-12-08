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

    @Test
    public void diceRollTest3() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{1, 1, 1, 4, 4});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : " + score);
        assertTrue(score == 1080);
    }

    @Test
    public void diceRollTest4() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{1, 1, 4, 4, 4});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : " + score);
        assertTrue(score == 600);
    }

    @Test
    public void diceRollTest5() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{1, 4, 4, 4, 4});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : " + score);
        assertTrue(score == 540);
    }

    @Test
    public void diceRollTest6() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{4, 4, 4, 4, 4});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : " + score);
        assertTrue(score == 480);
    }

    @Test
    public void diceRollTest7() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{5, 6, 2, 3, 1});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : " + score);
        assertTrue(score == 100);
    }

    @Test
    public void diceRollTest8() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{4, 6, 2, 3, 1});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : " + score);
        assertTrue(score == 140);
    }

    @Test
    public void diceRollTest9() throws Exception {
        List<Integer> diceRoll = Arrays.asList(new Integer[]{1, 1, 1, 4, 1});
        DiceApp diceApp = new DiceApp();
        int score = diceApp.diceScore(diceRoll);
        System.out.println("Score : " + score);
        assertTrue(score == 1140);
    }


}