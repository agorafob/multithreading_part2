package ua.ithillel.work2;

import java.util.Random;

public class Runner {
    public void run() throws InterruptedException {
        System.out.println("I run from work2");
        int [] array = getArr();
        int start = 10;
        int end = 73;
        MySumCount_1 msc1 = new MySumCount_1(start,end,array);
        msc1.start();
        MySumCount_2 msc2 = new MySumCount_2(start,end,array);
        Thread th = new Thread(msc2);
        th.start();

    }

    private static int[] getArr(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            Random number = new Random();
            arr[i]=number.nextInt(1000);
        }
        return arr;
    }



}
