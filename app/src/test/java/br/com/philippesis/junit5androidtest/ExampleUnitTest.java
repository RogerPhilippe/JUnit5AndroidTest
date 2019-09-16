package br.com.philippesis.junit5androidtest;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import br.com.philippesis.junit5androidtest.auxiliarclasses.Calculator;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    @DisplayName("Teste inicial JUnit 5 com Android Java")
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void checkAllOperations() {

        final Calculator calculator = new Calculator(6, 2);

        assertAll("Operações",
                () -> assertEquals(8, calculator.add()),
                () -> assertEquals(4, calculator.subtract()),
                () -> assertEquals(12, calculator.multiply()),
                () -> assertEquals(3, calculator.divide()));

    }

    @Test
    @DisplayName("Validação de exceção.")
    void checkException() {

        final Calculator calculator = new Calculator(3, 0);

        Throwable exception = assertThrows(Exception.class, calculator::divide);
        assertEquals("/ by zero", exception.getMessage());

    }

    // Repete test
    @RepeatedTest(5)
    void testExample() { assertEquals(2, 1+1); }

    @Disabled
    @Test
    void testIgnoredExample() { assertEquals(2, 1+1); }

}