import java.util.concurrent.locks.ReentrantLock;

public class ThreeMethodsClass {

    private final static ReentrantLock lock = new ReentrantLock();

    static private ThreeMethodsClass monitor = new ThreeMethodsClass();

    static private ThreeMethodsClass monitor1 = new ThreeMethodsClass(),monitor2 = new ThreeMethodsClass(),monitor3 = new ThreeMethodsClass();

    static public void main(String ... args){

        Thread t1 = new Thread(() -> {
            monitor.method1();
        });
        Thread t2 = new Thread(() -> {
            monitor.method2();
        });
        Thread t3 = new Thread(() -> {
            monitor.method3();
        });

        t1.start();t2.start();t3.start();


/*        Thread t1 = new Thread(() -> {
            monitor1.method1();
        });
        Thread t2 = new Thread(() -> {
            monitor2.method2();
        });
        Thread t3 = new Thread(() -> {
            monitor3.method3();
        });

        t1.start();t2.start();t3.start();*/
    }

    private  void method1(){
        lock.lock();
        System.out.println("method1");
        for (int i = 0, j = 0; i < 1000000000; ++i) j= i;
        System.out.println("method1");
        lock.unlock();
    }

    private void method2(){
        lock.lock();
        System.out.println("method2");
        for (int i = 0, j = 0; i < 1000000000; ++i) j= i;
        System.out.println("method2");
        lock.unlock();
    }

    private void method3(){
        lock.lock();
        System.out.println("method3");
        for (int i = 0, j = 0; i < 1000000000; ++i) j= i;
        System.out.println("method3");
        lock.unlock();
    }

}
