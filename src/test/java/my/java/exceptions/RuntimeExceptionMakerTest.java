package my.java.exceptions;

import org.junit.Test;

public class RuntimeExceptionMakerTest {
    @Test(expected = SampleRuntimeException.class)
    public void throwRuntimeException() {
        RuntimeExceptionMaker runtimeExceptionMaker = new RuntimeExceptionMaker();
        runtimeExceptionMaker.run();
    }

    @Test
    public void catchRuntimeException() {
        RuntimeExceptionMaker runtimeExceptionMaker = new RuntimeExceptionMaker();
        runtimeExceptionMaker.runAndCatch();
    }
}
