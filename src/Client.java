public class Client {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        BurgerObjectBuilder objectBuilder = new BurgerObjectBuilder();
        director.makeClassicBurger(objectBuilder);
        Burger classicBurger = objectBuilder.getResult();
        BurgerSpecBuilder specBuilder = new BurgerSpecBuilder();
        director.makeVeganBurger(specBuilder);
        String veganSpec = specBuilder.getResult();
        System.out.println(veganSpec);
        System.out.println(classicBurger);
    }
}