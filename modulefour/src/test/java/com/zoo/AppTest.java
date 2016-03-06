package com.zoo;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    @Test
    public void testApp()
    {
        ZooKeeperDetails one = new ZooKeeperDetails();
        Assert.assertEquals(one.getName(), "John");
    }

    @Test
    public void testTwo()
    {
        AnimalDetails two = new AnimalDetails();
        Assert.assertEquals(two.getName(), "Bear");

    }

    @Test
    public void testThree()
    {

        AnimalFoodDetails three = new AnimalFoodDetails();
        Assert.assertEquals(three.getFood(), "Meat, 5");

    }

    @Test
    public void testFour()
    {
        AnimalSchedule four = new AnimalSchedule();
        Assert.assertEquals(four.getSchedule(), "John, Bear");
    }
}
