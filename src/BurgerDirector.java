public class BurgerDirector {
    public void makeClassicBurger(BurgerBuilder builder) {
        builder.setBun("Classic bun").setPatty("Beef patty").setSauce("Ketchup");
    }
    public void makeVeganBurger(BurgerBuilder builder) {
        builder.setBun("Diet bun").setPatty("No patty").setSauce("Vegan mayo");
    }
}