package Task3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    static public void main(String ... args){
        ExecutorService executorService = Executors.newFixedThreadPool(20);

        for (int i = 0; i < 20; ++i) executorService.submit(new Task(20));
        executorService.shutdown();
    }
}
