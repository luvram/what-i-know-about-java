package my.java.exceptions;

public class RuntimeExceptionMaker {
    void runAndCatch() {
        try {
            foo();
        } catch (SampleRuntimeException e) {
        }
    }

    void run() {
        foo();
    }

    private void foo() {
        bar();
    }

    private void bar() {
        throw new SampleRuntimeException();
    }
}
