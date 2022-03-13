package com.company;

public class PremiumCoffeeMachine extends BasicCoffeeMachine implements Operation{
    private double milk;
    private double sugar;

    public PremiumCoffeeMachine(double coffee, double water, double milk, double sugar) {
        super(coffee, water);
        this.milk = milk;
        this.sugar = sugar;
    }

    @Override
    public double perform() throws Exception{
        if(this.getCoffee() <= 10){
            throw  new Exception("No coffee available.");
        }
        if(this.getWater() <= 10){
            throw  new Exception("No water available.");
        }
        if(this.milk <= 10){
            throw  new Exception("No milk available.");
        }
        if(this.sugar <= 10){
            throw  new Exception("No sugar available.");
        }
        setCoffee(getCoffee() - 10);
        setWater(getWater() - 10);
        milk -= 10;
        sugar -= 10;
        return this.getCoffee() + this.getWater() + this.milk + this.sugar;
    }
}
