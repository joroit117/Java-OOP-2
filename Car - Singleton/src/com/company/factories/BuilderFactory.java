package com.company.factories;

import com.company.BuilderType;
import com.company.Director;
import com.company.builders.CarBuilder;
import com.company.builders.CarManualBuilder;
import com.company.components.CarType;
import com.company.interfaces.Builder;
import com.company.singletons.BuilderSingleton;

public class BuilderFactory<T> {
    public Builder<T> createBuilder(CarType carType, BuilderType builderType){
        Director director = new Director();
        Builder<T> builder = BuilderSingleton.getInstance(builderType);
                /*BuilderType.CAR_BUILDER == builderType
                ? (Builder<T>) new CarBuilder()
                : (Builder<T>) new CarManualBuilder();*/
        switch (carType){
            case CITY_CAR:
                director.constructCityCar(builder);
                break;
            case SPORTS_CAR:
                director.constructSportsCar(builder);
                break;
            case SUV:
                director.constructSUVCar(builder);
                break;
        }
        return builder;
    }
}
