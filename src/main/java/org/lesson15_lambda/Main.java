package org.lesson15_lambda;

import static org.lesson15_lambda.FuncUtils.*;

public class Main {
    public static void main(String[] args) {

        System.out.println(isSimple.test(17));

        printRandomInt.accept(10);

        System.out.println(dayOfWeek.get());

        System.out.println(roundDouble.apply(19.4));
        System.out.println(roundDouble.apply(19.5));

        System.out.println(numberFibonacci.applyAsInt(10));


    }
}