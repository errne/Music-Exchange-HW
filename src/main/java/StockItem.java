import Behaviours.ISell;

public class StockItem implements ISell {
    private String name;
    private double buyCost;
    private double sellPrice;

    public StockItem(String name, double buyCost) {
        this.name = name;
        this.buyCost = buyCost;
        this.sellPrice = buyCost * 1.25;
    }

    public String getName() {
        return name;
    }

    public double getBuyCost() {
        return buyCost;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double newPrice){
        this.sellPrice = newPrice;
    }

    @Override
    public double calculateMarkup() {
        return getSellPrice() - getBuyCost();
    }
}
