public class Dice {
    private int value;

    public Dice(int value) {
        setValue(value);
    }

    public Dice() {
        roll();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value >= 1 && value <= 6) {
            this.value = value;
        } else {
            throw new IllegalArgumentException("Ogiltigt värde (1-6)");
        }
    }

    public void roll() {
        value = 1 + (int)(Math.random() * 6);
    }
}
