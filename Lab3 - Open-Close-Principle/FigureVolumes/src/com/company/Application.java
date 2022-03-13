package com.company;

import java.security.InvalidParameterException;
import java.util.List;

public class Application {
    public double calculate(List<Operation> operations){

        double total = 0;

        if(operations == null){
            throw new InvalidParameterException("Cannot perform operation");
        }
        for(Operation operation : operations){
            total += operation.perform();
        }

        return total;
    }
}