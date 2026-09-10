public class BurgerObjectBuilder implements BurgerBuilder {
    private String bun;
    private String patty;
    private String sauce;
    public BurgerObjectBuilder setBun(String bun) {
        this.bun = bun;
        return this;
    }
    public BurgerObjectBuilder setPatty(String patty) {
        this.patty = patty;
        return this;
    }
    public BurgerObjectBuilder setSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }
    public Burger getResult() {
        if (bun == null || patty == null || sauce == null)
            throw new IllegalStateException("All burger components are required");
        return new Burger(bun, patty, sauce);
    }
}