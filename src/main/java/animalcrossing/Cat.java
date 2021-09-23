package animalcrossing;
public class Cat extends Feline implements IPet{

    @Override
    public void printAnimalFood(){
        System.out.println("Cat eats " + this.food);
    }

    @Override
    public void makeNoise(){
        System.out.println("meooow");
    }

    @Override
    public void greet() {
        System.out.println("scratch ya face");
    }

    //no


}
