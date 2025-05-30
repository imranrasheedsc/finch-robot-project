package com.imranrasheed;

import com.birdbrain.Finch;


public class FinchDemo {
    public static boolean isBlocked(Finch object) {
        if (object.getDistance() < 8) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Finch myFinch = new Finch();

        boolean enabled = true;
    

        // myFinch.playNote(60,0.5);

        while (enabled) {
            myFinch.setMove("F",10,100);
            System.out.println(myFinch.getDistance());
            while (myFinch.getDistance() < 8) {
                myFinch.stop();
                enabled = false;
                System.out.println(myFinch.getCompass());
                while (FinchDemo.isBlocked(myFinch)) {
                    if (myFinch.getCompass() > 90) {
                        myFinch.setTurn("L",90,100);
                    } else {
                        myFinch.setTurn("R",180,100);
                    }
                }
                myFinch.pause(0.01);
                enabled = true;
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