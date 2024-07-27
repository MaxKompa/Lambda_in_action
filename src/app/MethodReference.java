package app;

import java.util.function.Function;

public class MethodReference {
        Function<String, Integer> countUpper = StringListProcessor::countUppercase;

        String input = "Hello World!";
        int uppercaseCount = countUpper.apply(input);
}

