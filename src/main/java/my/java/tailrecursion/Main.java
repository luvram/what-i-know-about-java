package my.java.tailrecursion;

public class Main {
    public static void main(String[] args) {
        System.out.println(Factorial.factorialTailRec(1, 5).invoke());
    }
}
