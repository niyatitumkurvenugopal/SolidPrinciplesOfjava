package com.niyati.solidprinciples.ocp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OpenClosePrincipleTest {

    @Test
    void testOpenClosePrinciple(){
        Operations operations1=new Operations(new AddOperation());
        assertEquals(10,operations1.executeOperation(3,7));

        Operations operations2=new Operations(new SubtractOperation());
        assertEquals(6,operations2.executeOperation(8,2));

        Operations operations3=new Operations(new MultiplyOperation());
        assertEquals(75,operations3.executeOperation(15,5));


    }

}