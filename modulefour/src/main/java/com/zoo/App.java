package com.zoo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        ZooKeeperDetails one = new ZooKeeperDetails();
        one.printKeeperDetails("John");
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    try {
        AnimalDetails two = new AnimalDetails();
        two.printAnimalDetails("Bear");
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    try {
        AnimalFoodDetails three = new AnimalFoodDetails();
        three.printAnimalFoodDetails("Meat", 4);
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    try {
        AnimalSchedule four = new AnimalSchedule();
        four.printAnimalSchedule("John", "Bear");
    }catch(Exception e)
    {
        System.out.println(e.getMessage());
    }
    }
}
