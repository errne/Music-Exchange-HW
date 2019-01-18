package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay, ISell {
    private String name;
    private int strings;

    public Guitar(String material, String colour, double buyCost, String name, int strings) {
        super(material, colour, InstrumentType.STRING, buyCost );
        this.name = name;
        this.strings = strings;
    }

    public String getName() {
        return name;
    }

    public int getStrings() {
        return strings;
    }

    @Override
    public String play() {
        return "Brmmmn";
    }

}
