public class BurgerSpecBuilder implements BurgerBuilder {
    private final StringBuilder sb = new StringBuilder("=== Burger Spec Sheet ===\n");
    public BurgerSpecBuilder setBun(String bun) {
        sb.append("Bun: ").append(bun).append("\n");
        return this;
    }
    public BurgerSpecBuilder setPatty(String patty) {
        sb.append("Patty: ").append(patty).append("\n");
        return this;
    }
    public BurgerSpecBuilder setSauce(String sauce) {
        sb.append("Sauce: ").append(sauce);
        return this;
    }
    public String getResult() {
        return sb.toString();
    }
}