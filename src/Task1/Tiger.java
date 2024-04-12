package Task1;

public class Tiger extends Animal{

    @Override
    public void voice(){
        System.out.println("Arrr");
    }
    @Override
    public void eat(String food){
        if (food == "Grass"){
            System.out.println("Seriously? Grass?");
        } else if (food == "Meat") {
            super.eat(food);
        }else {
            System.out.println("What is it?");
        }
    }
}
