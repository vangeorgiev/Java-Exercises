package com.company;

public class RyanAndMonicaJob implements Runnable {

    private BankAccount account = new BankAccount(100);

    public void run(){

        for (int i = 0; i < 10; i++) {
            makeWithdrawal(10);
            if(account.getBalance() < 0){
                System.out.println("Overdrawn!");
            }
        }
    }

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();
        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);

        one.setName("Ryan");
        two.setName("Monica");

        one.start();
        two.start();
    }

    private synchronized void makeWithdrawal (int amount){
        if(account.getBalance() >= amount){
            System.out.println(Thread.currentThread().getName() + " is about to withdrawal");
            try{
                System.out.println(Thread.currentThread().getName() + " is going to sleep...");
                Thread.sleep(500);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " woke up.");
            System.out.println(Thread.currentThread().getName() + " completes the withdraw.");
        } else{
            System.out.println("Sorry,not enough money for " + Thread.currentThread().getName());
        }
    }
}
