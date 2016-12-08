package com.app.dice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* create a class to calculate 5 dice rolls and capture the score based on below game rules
    1.A set matching three dice with outcome 1 earns a score of 1000 points
    2.A set matching three dice with outcome 2 earns a score of 200  points
    3.A set matching three dice with outcome 3 earns a score of 300  points
    4.A set matching three dice with outcome 4 earns a score of 400  points
    5.A set matching three dice with outcome 5 earns a score of 500  points
    6.A set matching three dice with outcome 6 earns a score of 600  points
    7.Each dice not part of the set earns a score
        7a. for outcome 1 on each earns 100 points
        7b. for outcome 1 on each earns 40 points
   8.Any other rolls will earn no points

 */
public class DiceApp {

    /*public static ArrayList<Integer> diceRoll() {
        //iterate the loop for five dice rolls
        ArrayList<Integer> diceOutcomeList = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Rolling  Dice");
            Random dice1 = new Random();
            int dice1Outcome = dice1.nextInt(6) + 1;
            diceOutcomeList.add(dice1Outcome);
            System.out.println(" Dice  Outcome " + dice1Outcome);
        }
        System.out.println(" Dice Result: " + diceOutcomeList);
        return diceOutcomeList;
    }*/


    public int diceScore(List<Integer> diceOutcomeResult) {
        int score = 0;
        int counter1 = Collections.frequency(diceOutcomeResult, new Integer(1));
        int counter2 = Collections.frequency(diceOutcomeResult, new Integer(2));
        int counter3 = Collections.frequency(diceOutcomeResult, new Integer(3));
        int counter4 = Collections.frequency(diceOutcomeResult, new Integer(4));
        int counter5 = Collections.frequency(diceOutcomeResult, new Integer(5));
        int counter6 = Collections.frequency(diceOutcomeResult, new Integer(6));
        boolean allOnesAdded = false;
        boolean allFoursAdded = false;
        if (counter1 >= 3) {
            score = 1000 + (counter1 - 3)*100;
            allOnesAdded = true;
        }
        if (counter2 == 3) {
            score = score + 200;
        }
        if (counter3 == 3) {
            score = score + 300;
        }
        if (counter4 >= 3) {
            score = score + (400 + (counter4 - 3)*40);
            allFoursAdded = true;
        }
        if (counter5 == 3) {
            score = score + 500;
        }
        if (counter6 == 3) {
            score = score + 600;
        }
        if(!allOnesAdded) {
            score = score + (counter1 * 100);
        }
        if(!allFoursAdded) {
            score = score + (counter4 * 40);
        }
        return score;
    }
}
