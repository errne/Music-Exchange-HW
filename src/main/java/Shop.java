import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {
    private String name;
    private ArrayList<ISell>stock;

    public Shop(String name) {
        this.name = name;
        this.stock = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addItemToStock(ISell item){
        this.stock.add(item);
    }

    public int getStockSize(){
        return this.stock.size();
    }

    public void removeItemFromStock(ISell item){
        this.stock.remove(item);
    }

    public double gettotalPotentialProfit(){
        double totalProfit = 0;
        for(ISell item : stock){
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }
}
