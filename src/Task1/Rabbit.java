package Task1;

public class Rabbit extends Animal {

    @Override
    public void voice() {
        System.out.println("Sorry, i don't speak English");
    }

    @Override
    public void eat(String food) {
        if (food == "Meat") {
            System.out.println("Oh no! I'm a vegan!");
        } else if (food == "Grass") {
            System.out.println("Good " + food + " wonderful!");
        }else {
            System.out.println("What is it?");
        }
    }
}
