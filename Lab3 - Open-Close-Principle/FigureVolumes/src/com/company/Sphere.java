package com.company;

import com.company.Operation;

public class Sphere implements Operation {
    // Storing radius of a sphere
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }


    @Override
    public Double perform() {
        double vol_sum = 0;
        vol_sum += (4 / 3) * Math.PI * this.radius
                * this.radius * this.radius;
        return vol_sum;
    }
}