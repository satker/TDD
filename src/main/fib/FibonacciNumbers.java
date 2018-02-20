package main.fib;

public class FibonacciNumbers {

    public int fib(int number) {
        if (number<0){
            throw new IllegalArgumentException();
        }
        if (number == 0) {
            return 0;
        }
        if (number == 1 || number == 2) {
            return 1;
        } else {
            return fib(number - 1) + fib(number - 2);
        }

    }
}
