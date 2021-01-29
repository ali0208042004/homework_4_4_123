package com.company;

public class Runner extends Thread {

    private volatile Runner runnerAfter;
    private volatile Runner runnerBefore;


    public Runner(String name) {
        super(name);
    }

    public void setRunnerBA(Runner runnerAfter, Runner runnerBefore) {
        this.runnerAfter = runnerAfter;
        this.runnerBefore = runnerBefore;
    }

    @Override
    public synchronized void run() {
        if (getName().equals("runner5")) {
            System.out.println("5 is running to finish");
            System.out.println("бежит к " + runnerBefore.getName());
        } else {
            System.out.println(getName() + " побежал к " + runnerAfter.getName());
            runnerAfter.start();

            try {
                runnerAfter.join();
            } catch (InterruptedException ignored) {

            }
        }
        if (getName().equals("runner5"))
            return;
        System.out.println(getName() + " took stick");
        if (!getName().equals("runner1"))
            System.out.println(getName() + "побежал передавать палку " + runnerBefore.getName());
        else
            System.out.println("забег окончен");
    }
}