package app;

import java.util.function.Supplier;

public class Supplier_EX {
        Supplier<Integer> randomSupplier = () -> RandomNumberGenerator.generateRandomNumber(1, 100);

        int randomNumber = randomSupplier.get();
}
