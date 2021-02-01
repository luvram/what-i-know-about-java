package my.java.tailrecursion;

import java.util.stream.Stream;

@FunctionalInterface
public interface TailCall {
    TailCall apply();

    default boolean isComplete() {
        return false;
    }

    default Long result() {
        throw new Error("not implemented");
    }

    default Long invoke() {
        return Stream.iterate(this, (t) -> {
            System.out.println(t);
            return t.apply();
        })
                .filter(TailCall::isComplete)
                .findFirst()
                .get()
                .result();

    }

}
