package cn.zedongw.a20210120;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciTest {
    Fibonacci fib = new Fibonacci();

    @Test
    public void fib(){
        System.out.println(fib.fib1(20));
        System.out.println(fib.fib2(20));
        System.out.println(fib.fib3(20));
        System.out.println(fib.fib4(20));
    }

}