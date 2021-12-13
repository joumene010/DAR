package tp3.ex1;

import java.util.Scanner;

public class Main {


    static class Methode1 extends Thread {
        @Override
        public void run() {
            System.out.println("my thread is running");
        }
    }
    static class Methode2 implements Runnable {
        @Override
        public void run() {
            System.out.println("my thread is running");
        }
    }

    public static void main(String[] args) throws InterruptedException {
            Methode1 t1 = new Methode1();
            t1.start();
            Methode2 t = new Methode2();
            Thread t2 = new Thread(t);
            t2.start();
            t1.join();
            t2.join();
            System.out.println("it s over !!");
        }

    }

