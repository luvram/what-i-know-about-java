package my.java.innerclass;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class OuterClassTest {
    @Test
    public void inner_class_생성() throws Exception {
        // Given
        OuterClass outerClass = new OuterClass();

        // When
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();

        // Then
        assertThat(innerClass.j).isEqualTo(2);
    }

    @Test
    public void static_inner_class_생성() throws Exception {
        // Given
        // When
        OuterClass.StaticInnerClass staticInnerClass =
                new OuterClass.StaticInnerClass();

        // Then
        assertThat(staticInnerClass.k).isEqualTo(3);
    }

    @Test
    public void anonymous_inner_class_생성() throws Exception {
        // Given
        // When
        OuterClass outerClass = new OuterClass() {
            @Override public String getName() {
                return "Anonymous Inner Class";
            }
        };

        // Then
        assertThat(outerClass.getName()).isEqualTo("Anonymous Inner Class");
    }
}