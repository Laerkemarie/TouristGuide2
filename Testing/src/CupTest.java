import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup cup = new Cup("Orange juice", 85.5);
        assertEquals("Orange juice", cup.getLiquidType());
    }

    @Test
    void getPercentageFull() {
        Cup cup = new Cup("Orange juice", 85.5);
        assertEquals(85.5, cup.getPercentFull(), 0.001);
    }

    @Test
    void setLiquidType() {
        Cup cup = new Cup("Orange juice", 85.5);
        cup.setLiquidType("Water");
        assertEquals("Water", cup.getLiquidType());
    }

    @Test
    void setPercentFull() {
        Cup cup = new Cup("Orange juice", 85.5);
        cup.setPercentFull(0.001);
        assertEquals(0.001, cup.getPercentFull(), 85.5);
    }
}