package fibo;

import java.text.DecimalFormat;

public class Fibo {
    public static void main (String[] args)
    {
        String f = args[0];
        int n = Integer.parseInt(args[1]);

        System.out.println(start(f, n));
    }

    public static long start (String f, int n)
    {
        if (f.equals("f1")) {
            long start = System.nanoTime();
            long result = f1(n);
            System.out.println( new DecimalFormat("#.########").format((double) ((System.nanoTime() - start)) / 1000000000) );
            return result;
        }

        if (f.equals("f2")) {
            long start = System.nanoTime();
            long result = f2(n);
            System.out.println( new DecimalFormat("#.########").format((double) ((System.nanoTime() - start)) / 1000000000) );
            return result;
        }

        return 0;
    }

    public static long f1 (int n)
    {
        if (n == 0) {
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        return f1(n-1) + f1(n-2);
    }

    public static long f2 (int n)
    {
        long a = 0;
        long b = 1;

        for (int i = 2; i <= n; ++i) {
            long next = a + b;
            a = b;
            b = next;
        }

        return b;
    }
}
