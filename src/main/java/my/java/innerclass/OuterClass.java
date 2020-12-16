package my.java.innerclass;

public class OuterClass {
    int i = 1;

    public String getName() {
        return "Outer Class";
    }

    class InnerClass {
        int j = 2;
    }

    static class StaticInnerClass {
        int k = 3;
    }
}
