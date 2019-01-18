package Instruments;

public enum InstrumentType {
    BRASS("Brass"),
    STRING("string"),
    WIND("Woodwind"),
    KEYBORD("Keyboard");

    private final String name;

    InstrumentType(String name) {
        this.name = name;
    }
}
