package com.kangfw.dp.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kangfw5
 * @since 2019-08-20
 */
public class Main {
    static int countLegs(List<? extends Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.countLegs();
        }
        return retVal;
    }

    static int countLegs1(List<Animal> animals) {
        int retVal = 0;
        for (Animal animal : animals) {
            retVal += animal.countLegs();
        }
        return retVal;
    }

    public static void main(String[] args) {
        List dogs = new ArrayList<Dog>();

        List animal = new ArrayList<Animal>();

        dogs.add(new Dog());


        System.out.println(dogs.getClass());
        System.out.println(animal.getClass());
        // 不会报错
        // countLegs(dogs);
        // 报错
        // countLegs1(dogs);
    }
}
