package Task6;

public class Task implements Runnable{

    private Object monitor;
    private String name;

    public Task(Object monitor, String name){
        this.monitor = monitor;
        this.name = name;
    }

    @Override
    public void run(){
        //synchronized(monitor){
            System.out.println("Thread: " + name + ", part 1");
            System.out.println("Thread: " + name + ", part 2");
            for (int i = 0,j=0; i < 1000000000; ++i) j=i + 1;
            System.out.println("Thread: " + name + ", part 3");
            System.out.println("Thread: " + name + ", part 4");
        //}
    }

    private synchronized void method1(){

    }

    public Object getMonitor() {
        return monitor;
    }

    public void setMonitor(Object monitor) {
        this.monitor = monitor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
