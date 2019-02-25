package Task4;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {


    static public void main(String ... args){
        ExecutorService executorService = Executors.newFixedThreadPool(20);


        Callable<Integer> myCallable = new Task(20);
        //Future<Integer> future = executorService.submit(myCallable);

        for (int i = 0; i < 20; ++i){
            Future<Integer> future = executorService.submit(myCallable);
            System.out.println(future);
        }
        //for (int i = 0; i < 20; ++i) Future<Integer> future = executorService.submit(new Task(20));
        executorService.shutdown();
    }
}
