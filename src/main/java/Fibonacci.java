/**
 * Created by syjsmk on 2016-02-10.
 */
public class Fibonacci {
    public long calculation(int n) {
        if (n <= 1) return n;
        else return calculation(n - 1) + calculation(n - 2);
    }
}