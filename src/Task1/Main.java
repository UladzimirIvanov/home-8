package Task1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Tiger tiger = new Tiger();
        Rabbit rabbit = new Rabbit();

        dog.voice();
        dog.eat("Meat");
        System.out.println();

        tiger.voice();
        tiger.eat("Meat");
        System.out.println();

        rabbit.voice();
        rabbit.eat("Meat");
    }
}
