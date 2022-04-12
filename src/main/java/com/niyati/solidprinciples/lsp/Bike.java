package com.niyati.solidprinciples.lsp;

public class Bike extends Vehicle{
    public Bike(Vehicle vehicle){
        super();
    }
    public String start(){
        return "starting a bike.";
    }

    public String stop(){
        return "stopping a bike.";
    }
}
