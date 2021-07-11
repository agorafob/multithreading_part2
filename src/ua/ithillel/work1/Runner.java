package ua.ithillel.work1;

public class Runner {
    public void run(){
        System.out.println("I run from work1");
        MyTimeBomb_1 mtb1 = new MyTimeBomb_1();
        mtb1.start();
        MyTimeBomb_2 mtb2 = new MyTimeBomb_2();
        Thread th = new Thread(mtb2);
        th.start();
    }
}
