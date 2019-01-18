package Instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {
    private Guitar guitar;

    @Before
    public void setUp() throws Exception {
        guitar = new Guitar("wood", "red", 100,"Bass", 4);
    }

    @Test
    public void getName() {
        assertEquals("Bass", guitar.getName());
    }

    @Test
    public void getStrings() {
        assertEquals(4, guitar.getStrings());
    }

    @Test
    public void play() {
        assertEquals("Brmmmn", guitar.play());
    }

    @Test
    public void calculateMarkup() {
        assertEquals(20, guitar.calculateMarkup(), 0.001);
    }

    @Test
    public void getMaterial() {
        assertEquals("wood", guitar.getMaterial());
    }

    @Test
    public void getColour() {
        assertEquals("red", guitar.getColour());
    }

    @Test
    public void getType() {
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void getBuyCost() {
        assertEquals(100, guitar.getBuyCost(), 0.001);
    }

    @Test
    public void getSellPrice() {
        assertEquals(120, guitar.getSellPrice(), 0.001);
    }

    @Test
    public void setSellPrice() {
        guitar.setSellPrice(125);
        assertEquals(125, guitar.getSellPrice(), 0.001);
    }
}