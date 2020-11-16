package com.chelsea;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
    Die myDie = new Die(6, 1, new ArrayList<>(), new ArrayList<>());
    myDie.firstRoll();
    myDie.selectedDice();

    }
}
