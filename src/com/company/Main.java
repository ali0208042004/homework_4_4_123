package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Runner runner1 = new Runner("runner1");
        Runner runner2 = new Runner("runner2");
        Runner runner3 = new Runner("runner3");
        Runner runner4 = new Runner("runner4");
        Runner runner5 = new Runner("runner5");


        runner1.setRunnerBA(runner2,runner5);
        runner2.setRunnerBA(runner3, runner1);
        runner3.setRunnerBA(runner4, runner2);
        runner4.setRunnerBA(runner5,runner3);
        runner5.setRunnerBA(runner1,runner4);


        runner1.start();
    }
}

