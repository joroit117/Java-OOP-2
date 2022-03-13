package com.company;

public class Main {

    public static void main(String[] args) {
	 BasicCoffeeMachine bcm = new BasicCoffeeMachine(150, 150);
	 PremiumCoffeeMachine pcm = new PremiumCoffeeMachine(100, 200, 100, 100);

     bcm.perform();
    }
}
