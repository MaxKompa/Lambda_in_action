package app;

import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        MathOperation addition = new MathOperation() {
            @Override
            public int operate(int a, int b) {
                return a + b;
            }
        };
        int additionResult = addition.operate(5, 3);
        System.out.println("Результат додавання: " + additionResult);


        StringManipulator toUpperCase = s -> s.toUpperCase();
        String upperCaseResult = toUpperCase.manipulate("hello world");
        System.out.println("Рядок в верхньому регістрі: " + upperCaseResult);


        Function<String, Integer> countUpper = StringListProcessor::countUppercase;
        int uppercaseCount = countUpper.apply("Hello World!");
        System.out.println("Кількість великих літер: " + uppercaseCount);


        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);
        int randomNumber = randomSupplier.get();
        System.out.println("Випадкове число від 1 до 100: " + randomNumber);
    }
}