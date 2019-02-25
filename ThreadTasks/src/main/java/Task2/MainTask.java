package Task2;

public class MainTask {

    static public void main(String ... args){
        for (int i = 0; i < 20; ++i){
            new Thread(new Task(20)).start();
        }
    }
}
