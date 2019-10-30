package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DogTest {

    private Dog dog1;

    @Before
    public void setUp() throws Exception {
        dog1 = new Dog("Bob");
    }

    @Test
    public void speak() {
        Assert.assertEquals("Bark!", dog1.speak());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Bob", dog1.getName());
    }

    @Test
    public void setNameTest() {
        dog1.setNamePet("Jill");
        Assert.assertEquals("Jill", dog1.getName());
    }
}