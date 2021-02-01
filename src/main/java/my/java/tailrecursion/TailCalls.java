package my.java.tailrecursion;

public class TailCalls<T> {
    public static TailCall call(final TailCall nextCall) {
        return nextCall;
    }

    public static TailCall done(final Long value) {
        return new TailCall() {
            @Override
            public boolean isComplete() {
                return true;
            }

            @Override
            public Long result() {
                return value;
            }

            @Override
            public TailCall apply() {
                throw new Error("not implemented");
            }
        };
    }
}
