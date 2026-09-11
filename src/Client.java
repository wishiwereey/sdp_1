public class Client {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        BurgerObjectBuilder classicObjBuilder = new BurgerObjectBuilder();
        director.makeClassicBurger(classicObjBuilder);
        Burger classicBurger = classicObjBuilder.getResult();
        BurgerSpecBuilder classicSpecBuilder = new BurgerSpecBuilder();
        director.makeClassicBurger(classicSpecBuilder);
        String classicSpec = classicSpecBuilder.getResult();
        BurgerSpecBuilder veganSpecBuilder = new BurgerSpecBuilder();
        director.makeVeganBurger(veganSpecBuilder);
        String veganSpec = veganSpecBuilder.getResult();
        System.out.println("--- Classic Burger Object ---");
        System.out.println(classicBurger);
        System.out.println("\n--- Classic Burger Spec ---");
        System.out.println(classicSpec);
        System.out.println("\n--- Vegan Burger Spec ---");
        System.out.println(veganSpec);
    }
}