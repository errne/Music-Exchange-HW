import Instruments.Guitar;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    private Shop shop;
    private Guitar guitar;
    private StockItem strings;

    @Before
    public void setUp() throws Exception {
        shop = new Shop("Shoppe");
        strings = new StockItem("Guitar strings", 10);
        guitar = new Guitar("wood", "red", 100,"Bass", 4);
    }

    @Test
    public void getName() {
        assertEquals("Shoppe", shop.getName());
    }

    @Test
    public void addItemToStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockSize());
    }

    @Test
    public void getStockSize() {
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void removeItemFromStock() {
        shop.addItemToStock(guitar);
        assertEquals(1, shop.getStockSize());
        shop.removeItemFromStock(guitar);
        assertEquals(0, shop.getStockSize());
    }

    @Test
    public void gettotalPotentialProfit() {
        shop.addItemToStock(guitar);
        shop.addItemToStock(guitar);
        shop.addItemToStock(strings);
        assertEquals(42.5, shop.gettotalPotentialProfit(), 0.001);
    }
}