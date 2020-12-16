package my.java.proxy;

import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Proxy;

import static org.assertj.core.api.Assertions.assertThat;


public class ProxyTest {
    private String name;

    @Before
    public void setUp() {
        name = "Luvram";
    }

    @Test
    public void basicProcess() {
        Hello hello = new HelloTarget();
        assertThat(hello.sayHello(name)).isEqualTo("Hello Luvram");
        assertThat(hello.sayHi(name)).isEqualTo("Hi Luvram");
        assertThat(hello.sayThankYou(name)).isEqualTo("Thank you Luvram");
    }

    @Test
    public void simpleProxy() {
        Hello proxiedHello = new HelloUppercase(new HelloTarget());
        assertThat(proxiedHello.sayHello(name)).isEqualTo("HELLO LUVRAM");
        assertThat(proxiedHello.sayHi(name)).isEqualTo("HI LUVRAM");
        assertThat(proxiedHello.sayThankYou(name)).isEqualTo("THANK YOU LUVRAM");
    }

    @Test
    public void dynamicProxy() {
        Hello proxiedHello = (Hello)Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class[] { Hello.class },
                new UppercaseHandler(new HelloTarget())
        );
        assertThat(proxiedHello.sayHello(name)).isEqualTo("HELLO LUVRAM");
        assertThat(proxiedHello.sayHi(name)).isEqualTo("HI LUVRAM");
        assertThat(proxiedHello.sayThankYou(name)).isEqualTo("THANK YOU LUVRAM");
    }
}
