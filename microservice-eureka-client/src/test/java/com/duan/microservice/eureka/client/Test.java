package com.duan.microservice.eureka.client;

/**
 * @author duanjw
 * @version 1.0
 * @date 2018/1/11 15:11
 */
public class Test {

    public static void main(String[] args) {
//        FibonacciTailRecursively(-1, 0, 1);
//        FibonacciRecursively(1111111111);
        int i = reverseIntHelper(567, 0);
        System.out.println("args = [" + i + "]");
    }

    public static int FibonacciTailRecursively(int n, int acc1, int acc2)
    {
        if (n == 0) return acc1;
        System.out.println(n);
        return FibonacciTailRecursively(n - 1, acc2, acc1 + acc2);
    }

    public static int FibonacciRecursively(int n)
    {
        System.out.println(n);
        if (n < 2) return n;
        return FibonacciRecursively(n - 1) + FibonacciRecursively(n - 2);
    }

    private static int reverseIntHelper(int i, int init){
        if(i==0) return init;
        return reverseIntHelper(i/10, init*10+i%10);
    }
}
