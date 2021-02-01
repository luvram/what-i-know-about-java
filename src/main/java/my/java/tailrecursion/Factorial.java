package my.java.tailrecursion;

public class Factorial {
    public static TailCall factorialTailRec(final long factorial, final long number) {
        if(number == 1) {
            return TailCalls.done(factorial);
        } else {
            return TailCalls.call(() -> factorialTailRec(factorial * number, number - 1));
        }
    }
}
