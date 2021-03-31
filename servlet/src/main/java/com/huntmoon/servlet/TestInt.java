package com.huntmoon.servlet;

public class TestInt {
    public static void main(String[] args) throws InterruptedException {
//        Thread.currentThread().interrupt();
//        System.out.println(interrupted);
        TestThead testThead = new TestThead();
        testThead.start();
        System.out.println(System.currentTimeMillis());
        Thread.sleep(1000);
        System.out.println(System.currentTimeMillis());
        testThead.interrupt();

    }

    public static class TestThead extends Thread {
        @Override
        public void run() {
            try {
//                System.out.println(System.currentTimeMillis());
                Thread.sleep(13000);
            } catch (InterruptedException e) {
                System.out.println("thread "+Thread.interrupted()+System.currentTimeMillis());
                e.printStackTrace();
            }
        }
    }

}
