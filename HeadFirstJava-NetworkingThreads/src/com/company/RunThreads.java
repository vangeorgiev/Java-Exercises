package com.company;

public class RunThreads implements Runnable {
    public static void main(String[] args) {
        Runnable runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);


        alpha.setName("Alpha");
        beta.setName("Beta");

        try{
            beta.sleep(2000);

        }catch (InterruptedException e){
            e.printStackTrace();
        }
        alpha.start();
        beta.start();
    }

    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running...");
        }
    }
}
