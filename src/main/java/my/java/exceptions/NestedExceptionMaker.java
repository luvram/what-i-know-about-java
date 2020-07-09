package my.java.exceptions;

public class NestedExceptionMaker {
    void run() {
        try {
            foo();
        }catch(SampleRuntimeException e) {
            throw new NestedException(e);
        }
    }

    private void foo() {
        throw new SampleRuntimeException();
    }
}
