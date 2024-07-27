package app;

@FunctionalInterface
public interface StringManipulator {
    String manipulate(String input);
    StringManipulator toUpperCase = input -> input.toUpperCase();


}
