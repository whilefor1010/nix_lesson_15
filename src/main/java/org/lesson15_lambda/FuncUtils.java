package org.lesson15_lambda;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Random;
import java.util.function.*;

public interface FuncUtils {

    //Predicate
    IntPredicate isSimple = x -> {

        for(int i =2; i<x; i++){
            if(x%i==0){
                return false;
            }
        }

        return true;
    };

    //Consumer
    IntConsumer printRandomInt = x -> System.out.println(new Random().nextInt(x));

    //Supplier
    Supplier<DayOfWeek> dayOfWeek = LocalDate.now()::getDayOfWeek;

    //Function
    Function<Double,Long> roundDouble = x -> Math.round(x);

    //UnaryOperator
    IntUnaryOperator numberFibonacci = x -> {

        if(x <= 1){
            return 0;
        }

        int prev = 0;
        int res = 1;

        for (int i = 2; i < x; i++) {

            int tmp = prev;
            prev = res;
            res  = res + tmp;

        }

        return res;

    };


}
