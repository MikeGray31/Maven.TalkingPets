package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PetTest {

    private Pet pet1;

    @Before
    public void setUp() throws Exception {
        pet1 = new Pet("Bob");
    }

    @Test
    public void speak() {
        Assert.assertEquals("speak", pet1.speak());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Bob", pet1.getName());
    }

    @Test
    public void setNameTest() {
        pet1.setNamePet("Jill");
        Assert.assertEquals("Jill", pet1.getName());
    }



    @Test
    public void testToString() {
        Pet[] pets = new Pet [] {
                pet1,
                new Cat("Job"),
                new Dog("Rob"),
                new Frog("Cob")
        };
        
        for (Pet pet: pets) {
            Assert.assertEquals(String.format("Name: %s -- Says: %s", pet.getName(), pet.speak()), ((Pet) pet).toString());
        }
    }


}