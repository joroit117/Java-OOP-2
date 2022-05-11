package com.company;

import com.company.builders.CarBuilder;
import com.company.builders.CarManualBuilder;
import com.company.components.CarType;
import com.company.factories.BuilderFactory;
import com.company.interfaces.Builder;

public class Main {

    public static void main(String[] args) throws Exception{

        BuilderFactory<Car> carBuilderFactory = new BuilderFactory<>();

        Builder<Car> carBuilder = carBuilderFactory.createBuilder(CarType.SPORTS_CAR, BuilderType.CAR_BUILDER);

        Car sports = carBuilder.build();

        System.out.println(sports.getCarType());

        BuilderFactory<Manual> manualBuilderFactory = new BuilderFactory<>();

        Builder<Manual> manualBuilder = manualBuilderFactory.createBuilder(CarType.CITY_CAR, BuilderType.MANUAL_BUILDER);

        Manual cityCar = manualBuilder.build();

        System.out.println(cityCar);
    }
}
