package Task6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {



    static public void main(String ... args){
        Object monitor = new Object();

        Thread t1 = new Thread(new Task(monitor, "t1"));
        Thread t2 = new Thread(new Task(monitor, "t2"));
        Thread t3 = new Thread(new Task(monitor, "t3"));
        Thread t4 = new Thread(new Task(monitor, "t4"));
        Thread t5 = new Thread(new Task(monitor, "t5"));

        ExecutorService eS = Executors.newFixedThreadPool(5);
        eS.submit(t1); eS.submit(t2); eS.submit(t3); eS.submit(t4); eS.submit(t5);

        eS.shutdown();

    }
}
