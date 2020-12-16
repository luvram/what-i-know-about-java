package my.java.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class UppercaseHandler implements InvocationHandler {
    private Object target;

    public UppercaseHandler(Object target) {
        this.target = target;
    }

    @Override public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable {
        Object result = method.invoke(target, args);
        if (result instanceof String) {
            return ((String) result).toUpperCase();
        }
        return result;
    }
}
