This project demonstrates the Builder Pattern.

Structure:
Product - Burger.
Builder - BurgerBuilder.
ConcreteBuilder 1 - BurgerObjectBuilder, creates a Burger object.
ConcreteBuilder 2 - BurgerSpecBuilder, creates a text specification.
Director - BurgerDirector.
Client - Client.

Each burger consists of 3 components:
Bun
Patty
Sauce

The BurgerDirector defines the construction steps.  
Both concrete builders use the same steps but produce different representations:
BurgerObjectBuilder - Burger
BurgerSpecBuilder - String