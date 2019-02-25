package Task4;

import java.util.concurrent.Callable;

public class Task implements Callable<Integer> {

    private int n;

    public Task(int n){
        this.n = n;
    }

    @Override
    public Integer call() throws Exception {
        int fi_1 = 1;
        int fi = 1;
        int fip1 = 0;
        int sum = 1;
        for (int i = 0; i < n; ++i){
            fip1 = fi_1 + fi;
            System.out.println("fi_1 = "+ fi_1 + "  fi = " + fi + "  fip1 = " + fip1);
            fi_1 = fi;
            fi = fip1;
            sum += fip1;
        }
        return new Integer(sum);
    }
}
