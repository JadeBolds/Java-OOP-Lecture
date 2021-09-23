package animalcrossing;

import java.util.ArrayList;

public class AnimalKingdom {
    public static void main(String[] args) {

       //Creating Animal Objects
//        Animal animal1 = new Animal();
//        animal1.makeNoise();
//
//        Animal animal2 = new Animal();
//        animal2.makeNoise();

        Dog dog = new Dog();
        dog.food ="h";
        Cat cat = new Cat();



        Animal[] arrayOfAnimals = new Animal[2];
        arrayOfAnimals[0] = dog;
        arrayOfAnimals[1] = cat;

     Animal.printAnimalNoiseAndWhatTheyEat(arrayOfAnimals);





    }
}
