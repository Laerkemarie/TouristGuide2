import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculator = new Calculator();
        assertEquals(3, calculator.add(1,2));
        assertTrue(calculator.add(1,2)==3);
    }

    @Test
    void testAdd() {

    }
}