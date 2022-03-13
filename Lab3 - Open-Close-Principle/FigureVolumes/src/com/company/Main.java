package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[])
    {
        List<Operation> listElements = new ArrayList<>();

        Cuboid cb1 = new Cuboid(5, 10 ,15);
        Cuboid cb2 = new Cuboid(2, 4, 6);
        Cuboid cb3 = new Cuboid(3, 12, 15);

        listElements.add(cb1);
        listElements.add(cb2);
        listElements.add(cb3);

        Sphere sp1 = new Sphere(5);
        Sphere sp2 = new Sphere(2);
        Sphere sp3 = new Sphere(3);

        listElements.add(sp1);
        listElements.add(sp2);
        listElements.add(sp3);

        Application app = new Application();

        double vol = app.calculate(listElements);

        System.out.println("The total volume is " + vol);
    }
}
