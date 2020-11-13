package com.chelsea;

/*Create a console based application that will let a user roll 5 dice 3 times.
After each roll they can pick which dice they want to roll again.*/

/*
    v1.0 I have a die CHECK
    v1.1 that die can be rolled to have a random value CHECK
    v1.2 I can roll the die X times then the application finishes CHECK
    v1.3 I can have multiple dice. (5 specifically)
    v1.4 Each roll all the dice have their own random values.
    v1.5 I can roll again just the first die
    v1.6 i can roll again a specific die
    v1.7 I can get a single die choice from the user which is rerolled
    v1.8 I can get multiple dice selections from the user which are rerolled.
    v1.9 Polish up the user interaction. */

public class Die {

    private int die1;

    public Die(int die1) {

        this.die1 = die1;
    }

    public static void roll() {

        for (int i = 1; i < 4; i++) {
            int die1 = (int) (Math.random() * 6) + 1;
            System.out.println("turn " + i + ": " + die1);
        }

    }
}
