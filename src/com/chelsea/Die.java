package com.chelsea;

/*Create a console based application that will let a user roll 5 dice 3 times.
After each roll they can pick which dice they want to roll again.*/

/*
    v1.1 that die can be rolled to have a random value
    v1.2 I can roll the die X times then the application finishes CHECK
    v1.3 I can have multiple dice. (5 specifically)
    v1.4 Each roll all the dice have their own random values.
    v1.5 I can roll again just the first die
    v1.6 i can roll again a specific die
    v1.7 I can get a single die choice from the user which is rerolled
    v1.8 I can get multiple dice selections from the user which are rerolled.
    v1.9 Polish up the user interaction. */

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Die {

    private int numOfSides = 6;
    private int faceValue;
    private ArrayList<Integer> allDice;
    private ArrayList<Integer> selectedDice;


    public Die(int numOfSides, int faceValue, ArrayList<Integer> allDice, ArrayList<Integer> selectedDice) {

        this.numOfSides = numOfSides;
        this.faceValue = faceValue;
        this.allDice = allDice;
        this.selectedDice = selectedDice;

    }


    public void firstRoll() {
        Random random = new Random();
        int die1 = random.nextInt(numOfSides) + 1;
        allDice.add(die1);
        int die2 = random.nextInt(numOfSides) + 1;
        allDice.add(die2);
        int die3 = random.nextInt(numOfSides) + 1;
        allDice.add(die3);
        int die4 = random.nextInt(numOfSides) + 1;
        allDice.add(die4);
        int die5 = random.nextInt(numOfSides) + 1;
        allDice.add(die5);

        System.out.println(allDice);
        System.out.println(allDice.get(1));
    }

    public void selectedDice() {
        //for loop with length of array
        //take user input, compare it to each item in array
        //if it equals item in array, add to selected array
        //remove to unselected array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which dice would you like to keep? 1, 2, 3, 4, 5?");
        String playerAnswer = scanner.nextLine();

        for (int i = 0; i < allDice.size(); i++) {
            if (allDice.get(i).equals(playerAnswer)) {
                System.out.println(allDice.get(i));
                selectedDice.add(allDice.get(i));
                allDice.remove(i);
                System.out.println(selectedDice);
                System.out.println(allDice);
            }
        }
    }


    public int getFaceValue() {
        return faceValue;
    }

}
