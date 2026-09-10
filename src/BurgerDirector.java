public class BurgerDirector {
    public void makeClassicBurger(BurgerBuilder builder) {
        builder.setBun("Classic bun").setPatty("Beef patty").setSauce("Ketchup");
    }
    public void makeVeganBurger(BurgerBuilder builder) {
        builder.setBun("Whole wheat bun").setPatty("Beyond Meat patty").setSauce("Vegan mayo");
    }
}