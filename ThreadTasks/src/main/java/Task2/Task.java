package Task2;

public class Task implements Runnable {

    private int n;

    public Task(int n){
        this.n = n;
    }

    @Override
    public void run() {
        int fi_1 = 1;
        int fi = 1;
        int fip1 = 0;
        for (int i = 0; i < n; ++i){
            fip1 = fi_1 + fi;
            System.out.println("fi_1 = "+ fi_1 + "  fi = " + fi + "  fip1 = " + fip1);
            fi_1 = fi;
            fi = fip1;
        }

    }
}
