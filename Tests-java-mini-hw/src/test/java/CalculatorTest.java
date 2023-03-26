import org.junit.jupiter.api.*;

import org.example.Calculator;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeAll
    static void setup() {
        System.out.println("@BeforeAll executed");
        calculator = new Calculator();
    }

    @BeforeEach
    void setupThis() {
        calculator.turnOn();
    }

    @Tag("PROD")
    @Test
    @DisplayName("Test 1: add")
    void testAddTwoPlusTwo() {
        var expected = 4;
        var result = calculator.add(2, 2);
        Assertions.assertEquals(expected, result);
    }

    @Tag("PROD")
    @Test
    @DisplayName("Test 2: add")
    void testAddSixMinusOne() {
        var expected = 5;
        var result = calculator.add(6, -1);
        Assertions.assertEquals(expected, result);
    }

    @Tag("DEV")
    @Test
    @DisplayName("Test 3: mod")
    void testModFst() {
        var expected = 1;
        var result = calculator.mod(3, 2);
        Assertions.assertEquals(expected, result);
    }

    @Tag("DEV")
    @Test
    @DisplayName("Test 4: mod")
    void testModSec() {
        var expected = 1;
        var result = calculator.mod(5, 2);
        Assertions.assertEquals(expected, result);
    }

    @AfterEach
    void shutDownThis() {
        calculator.turnOff();
    }

    @AfterAll
    static void tear() {
        System.out.println("@AfterAll executed");
    }
}
