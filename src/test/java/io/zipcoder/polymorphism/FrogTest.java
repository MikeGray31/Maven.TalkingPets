package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FrogTest {

    private Frog frog1;

    @Before
    public void setUp() throws Exception {
        frog1 = new Frog("Bob");
    }

    @Test
    public void speak() {
        Assert.assertEquals("Ribbit!", frog1.speak());
    }

    @Test
    public void getNameTest() {
        Assert.assertEquals("Bob", frog1.getName());
    }

    @Test
    public void setNameTest() {
        frog1.setNamePet("Jill");
        Assert.assertEquals("Jill", frog1.getName());
    }
}