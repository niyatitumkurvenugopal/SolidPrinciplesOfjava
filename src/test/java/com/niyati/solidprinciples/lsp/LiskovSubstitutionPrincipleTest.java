package com.niyati.solidprinciples.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LiskovSubstitutionPrincipleTest {
    @Test
    void testLiskovSubstitution(){
        Vehicle vehicle =new Vehicle();
        assertEquals("starting a vehicle",vehicle.start());
        assertEquals("stopping a vehicle",vehicle.stop());

        Car car=new Car(new Vehicle());
        assertEquals("starting a car.",car.start());
        assertEquals("stopping a car.",car.stop());

        Bike bike=new Bike(new Vehicle());
        assertEquals("starting a bike.",bike.start());
        assertEquals("stopping a bike.",bike.stop());

    }
}