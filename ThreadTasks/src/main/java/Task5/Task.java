package Task5;

import java.util.Random;

public class Task extends Thread{


    @Override
    public void run() {
        Random random = new Random();
        int rnd = random.nextInt(10) + 1;
        try{
            sleep(rnd);
        } catch(InterruptedException e){e.fillInStackTrace();}

        System.out.println(getName() + ": I had been sleeping for " + rnd + " seconds.");
    }
}
