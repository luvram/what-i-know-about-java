package my.java.exceptions;

public class CheckedExceptionMaker {
    void run() throws SampleCheckedException {
        foo();
    }

    private void foo() throws SampleCheckedException {
        bar();
    }

    private void bar() throws SampleCheckedException {
        throw new SampleCheckedException();
    }
}
