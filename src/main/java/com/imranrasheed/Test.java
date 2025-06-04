package com.imranrasheed;

import com.birdbrain.Finch;
import java.util.Scanner;

import java.util.ArrayList;

public class FinchDemo {
    public static void main(String[] args) {
        Finch myFinch = new Finch();

        boolean enabled = true;

        Scanner input = new Scanner(System.in);


        System.out.println("Enter W,A,S,D to control the Finch");
        String option = "";

        while (!option.equals("EXIT")) {
            option = input.next().toUpperCase();
            if (option.equals("W")) {
                myFinch.setMove("F",10,100);
            } else if (option.equals("A")) {
                myFinch.setTurn("L",90,100);
            } else if (option.equals("S")) {
                myFinch.setMove("B",10,100);
            } else if (option.equals("D")) {
                myFinch.setTurn("R",90,100);
            }
        }

        input.close();

        myFinch.stopAll();
        myFinch.disconnect();
    }
}