public class PingPong {

    static Object monitor = new Object();

    public static void main(String ... args){
        Thread t1 = new Thread(() -> { synchronized(monitor){
            while (true) {
                System.out.println("Ping");
                monitor.notify();
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.fillInStackTrace();
                }
            }
        }
        });

        Thread t2 = new Thread(() -> {synchronized(monitor){
            while(true) {
                System.out.println("Pong");
                monitor.notify();
                try {
                    monitor.wait();
                } catch (InterruptedException e) {
                    e.fillInStackTrace();
                }
            }
        }
        });

        t1.start();
        t2.start();

    }
}
