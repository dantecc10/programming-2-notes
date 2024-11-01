package virtual_horizon_samples.Fibonacci;

public static int acm(int m, int n) {
    if (m == 0) {
        return n + 1;
    } else if (n == 0) {
        return acm(m - 1, 1);
    } else {
        return acm(m - 1, acm(m, n - 1));
    }    
}