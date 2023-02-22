package com.example.timer;

import com.example.annotation.TimeIt;

public class Timer {
    @TimeIt
    public void waitSeconds(long seconds) {
        System.out.println("Waiting for " + seconds + "...");
        synchronized(this) {
            try {
                wait(seconds * 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                return;
            }
            System.out.println("Done !");
        }
    }
}
