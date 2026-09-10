public final class Burger {
    private final String bun;
    private final String patty;
    private final String sauce;
    Burger(String bun, String patty, String sauce) {
        this.bun = bun;
        this.patty = patty;
        this.sauce = sauce;
    }
    @Override
    public String toString() {
        return "Burger[" + bun + ", " + patty + ", " + sauce + "]";
    }
}