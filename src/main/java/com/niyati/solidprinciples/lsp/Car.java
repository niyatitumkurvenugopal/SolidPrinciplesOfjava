package com.niyati.solidprinciples.lsp;

public class Car extends Vehicle{
    public Car(Vehicle vehicle){
        super();
    }

    public String start(){
        return "starting a car.";
    }

    public String stop(){
        return "stopping a car.";
    }
}
