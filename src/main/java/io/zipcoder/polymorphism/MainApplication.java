package io.zipcoder.polymorphism;

import java.util.ArrayList;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static void main(String[] args) {

        Integer n = Console.getIntegerInput("How many pets do you have? ");
        ArrayList<Pet> pets = new ArrayList<Pet>();
        Pet newPet;

        for (int i = 1; i <= n; i++) {
            String s = Console.getStringInput("What kind of animal is pet number "+ i + "? ");
            String name = Console.getStringInput("What is the name of pet number "+ i + "? ");

            switch (s){
                case "dog":
                    newPet = new Dog(name);
                    break;
                case "cat":
                    newPet = new Cat(name);
                    break;
                case "frog":
                    newPet = new Frog(name);
                    break;
                default:
                    System.out.println("That's not an animal I know.");
                    newPet = new Pet(name);
                    break;
            }
            pets.add(newPet);
        }
        for(int j = 0; j < pets.size(); j++){
            System.out.println(pets.get(j));
        }

    }
}
