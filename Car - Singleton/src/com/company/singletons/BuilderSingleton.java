package com.company.singletons;

import com.company.BuilderType;
import com.company.builders.CarBuilder;
import com.company.builders.CarManualBuilder;
import com.company.interfaces.Builder;

import java.util.HashMap;
import java.util.Map;

public class BuilderSingleton {
    private static Map<BuilderType, Builder> carBuilders = new HashMap<>();

    private BuilderSingleton(){}
    public static Builder getInstance(BuilderType builderType){
        if(!carBuilders.containsKey(builderType)) {
            if (builderType == BuilderType.CAR_BUILDER) {
                carBuilders.put(builderType, new CarBuilder());
            } else if (builderType == BuilderType.MANUAL_BUILDER) {
                carBuilders.put(builderType, new CarManualBuilder());
            }
        }
        return carBuilders.get(builderType);
    }
}
