package com.company;

public class Cuboid implements Operation {
    // Member variables of this class
    private double length;
    private double breadth;
    private double height;

    public Cuboid(double length, double breadth, double height){
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    @Override
    public Double perform() {
        double vol_sum = 0;
        vol_sum += this.length * this.breadth
                * this.height;
        return vol_sum;
    }
}