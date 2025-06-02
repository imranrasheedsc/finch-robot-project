package com.imranrasheed;

import com.birdbrain.Finch;


public class FinchDemo {
    // public static boolean isBlocked(Finch object) {
    //     if (object.getDistance() < 8) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }

    public static void main(String[] args) {
        Finch myFinch = new Finch();

        boolean enabled = true;
    

        // myFinch.playNote(60,0.5);
        System.out.println("yes");

        while (enabled) {
            if (Math.abs(myFinch.getCompass() - 90) < Math.abs(myFinch.getCompass() - 180)) {
                System.out.println("Direction facing closer to 90: " + myFinch.getCompass());
            } else {
                System.out.println("Direction facing closer to 180: " + myFinch.getCompass());
            }
            while (myFinch.getDistance() > 15) {
                myFinch.setBeak(0,255,0);
                myFinch.setMove("F",20,100);
                System.out.println("Right line sensor: " + myFinch.getLine("R"));
                // if (myFinch.getLine("R") > 90) {
                //     myFinch.setTurn("L",-myFinch.getCompass(),50);
                //     myFinch.setTurn("L",90,50);
                //     myFinch.stop();
                //     enabled = false;
                // }
                // myFinch.stop();
                // enabled = false;
                // System.out.println(myFinch.getCompass());
                // while (FinchDemo.isBlocked(myFinch)) {
                //     if (myFinch.getCompass() > 90) {
                //         myFinch.setTurn("L",90,100);
                //     } else {
                //         myFinch.setTurn("R",180,100);
                //     }
                // }
                // myFinch.pause(0.01);
                // enabled = true;
            }
            myFinch.setBeak(255,0,0);
            myFinch.stop();
            myFinch.setTurn("L",90,50);
            if (myFinch.getDistance() < 15) {
                myFinch.setTurn("L",180,50);
            }

            // if (myFinch.getDistance() < 7) {
            //     myFinch.stop();
            //     enabled = false;
            //     myFinch.setTurn("R",90,100);
            //     myFinch.pause(0.05);
            //     System.out.println(myFinch.getDistance());
            //     enabled = true;
            // }
        }

        myFinch.stopAll();
        myFinch.disconnect();
    }
}