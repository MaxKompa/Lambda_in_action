package app;

public class AnonymousClass {
    MathOperation addition = new MathOperation() {
        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    };
}