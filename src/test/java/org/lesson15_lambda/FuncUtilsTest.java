package org.lesson15_lambda;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.lesson15_lambda.FuncUtils.*;
import java.time.LocalDate;

class FuncUtilsTest {

    @Test
    void shouldBeSimple() {

        assertThat(isSimple.test(17)).isTrue();

    }

    @Test
    void shouldRoundDouble() {

        assertThat(roundDouble.apply(19.5)).isEqualTo(20L);
        assertThat(roundDouble.apply(19.3)).isEqualTo(19L);

    }

    @Test
    void shouldBeCurrentDay() {

        assertThat(dayOfWeek.get())
                .isEqualTo(LocalDate.now().getDayOfWeek());

    }

    @Test
    void shouldGetFibonacciNumber() {

        assertThat(numberFibonacci.applyAsInt(10)).isEqualTo(34);

    }

}