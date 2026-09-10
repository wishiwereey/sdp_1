public class Client {
    public static void main(String[] args) {
        BurgerDirector director = new BurgerDirector();
        BurgerObjectBuilder objectBuilder = new BurgerObjectBuilder();
        director.makeClassicBurger(objectBuilder);
        Burger burger = objectBuilder.getResult();
        BurgerSpecBuilder specBuilder = new BurgerSpecBuilder();
        director.makeClassicBurger(specBuilder);
        String spec = specBuilder.getResult();
        System.out.println(spec);
        System.out.println(burger);
    }
}