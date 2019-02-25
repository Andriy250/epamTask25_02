package Task5;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Main {

    static public void main(String ... args){

        Thread t1 = new Task();
        Thread t2 = new Task();
        Thread t3 = new Task();
        Thread t4 = new Task();
        Thread t5 = new Task();

        //t1.start(); t2.start(); t3.start(); t4.start(); t5.start();


        ScheduledExecutorService sES = Executors.newScheduledThreadPool(3);
        sES.schedule(t1,0, TimeUnit.SECONDS);
        sES.schedule(t2,0, TimeUnit.SECONDS);
        sES.schedule(t3,0, TimeUnit.SECONDS);
        sES.schedule(t4,0, TimeUnit.SECONDS);
        sES.schedule(t5,0, TimeUnit.SECONDS);


        sES.shutdown();
    }
}
