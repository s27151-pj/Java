package pl.pjatk.demo;

public enum Size {
    SMALL(1), MEDIUM(1.5), GIANT(2);

    private final double multiplier;

    Size(double multiplier) {
        this.multiplier = multiplier;
    }

    public double getMultiplier() {
        return multiplier;
    }
}
