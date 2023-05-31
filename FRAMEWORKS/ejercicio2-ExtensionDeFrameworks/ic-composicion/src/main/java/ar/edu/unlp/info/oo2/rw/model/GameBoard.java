package ar.edu.unlp.info.oo2.rw.model;

import java.util.*;
import java.lang.Thread;

public class GameBoard
{
    // instance variables - replace the example below with your own
    List<Robot> robots = new ArrayList<Robot>();
    Boolean running;
    double cycle;
    double maxCycles;
    int delayeBetweenSteps = 1;
    
    public void runForCicles(double cycles) {
        running = true;
        cycle = 1;
        maxCycles = cycles;
        System.out.println("Will run for " + cycles + " cycles, waiting " + delayeBetweenSteps + " seconds betwee cycles");
        this.run();
    }
    
    public void runUntilStopped() {
        running = true;
        cycle = 1;
        maxCycles = Double.POSITIVE_INFINITY;
        System.out.println("Will run for until stopped");
        this.run();
    }
    
    public void stop() {
        running = false;
        System.out.println("Stopped");
    };
    
    public void add(Robot r) {
        robots.add(r);
    }
    
    private void run() {
        Thread thread = new Thread() {
            public void run() {
                while (running & (cycle <= maxCycles)) {
                    step();                   
                    try {
                        Thread.sleep(delayeBetweenSteps * 1000);
                    } catch (InterruptedException e) {
                        running = false;
                    };
                }
            };
        };
        thread.start();
    }
    
    private void step() {
        System.out.println("------ Running cycle number " + cycle);
        cycle ++;  
        for (Robot r : robots) {
            r.step();
        }
            
    }
    
    
    

}
