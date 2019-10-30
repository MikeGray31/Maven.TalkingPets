package io.zipcoder.polymorphism;

/**
 * Created by leon on 2/16/18.
 */
public class Pet{



    //fields
    String namePet;

    //constructor
    public Pet(String name) {
        namePet = name;
    }

    //methods
    public String speak(){
        return "speak";
    }

    @Override
    public String toString() {
        return "Name: " + namePet + " -- " +
               "Says: " + this.speak();
    }

    //getters and setters
    public String getName() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

}
