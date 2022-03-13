package com.company;

public class BasicCoffeeMachine implements Operation{
    private double coffee;
    private double water;

    public BasicCoffeeMachine(double coffee, double water){
        this.coffee = coffee;
        this.water = water;
    }

    public double getCoffee() {
        return coffee;
    }

    public void setCoffee(double coffee) {
        this.coffee = coffee;
    }

    public double getWater() {
        return water;
    }

    public void setWater(double water) {
        this.water = water;
    }

    @Override
    public double perform() throws Exception {
        if(coffee <= 10){
            throw new Exception("No coffee available.");
        }
        if(water <= 10){
            throw new Exception("No water available.");
        }
        coffee -= 10;
        water -= 10;
        return this.coffee + this.water;
    }
}
