package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    private Cat cat1;

    @Before
    public void setUp() throws Exception {
        cat1 = new Cat("Bob");
    }

    @Test
    public void speak() {
        Assert.assertEquals("Meow!", cat1.speak());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Bob", cat1.getName());
    }

    @Test
    public void setNameTest() {
        cat1.setNamePet("Jill");
        Assert.assertEquals("Jill", cat1.getName());
    }
}