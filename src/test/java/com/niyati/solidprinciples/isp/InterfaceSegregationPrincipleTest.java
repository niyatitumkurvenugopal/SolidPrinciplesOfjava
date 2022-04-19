package com.niyati.solidprinciples.isp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterfaceSegregationPrincipleTest {
    @Test
    void testInterfaceSegregation(){
        DataTypeConversion dataTypeConversion=new DataTypeConversion();
        assertEquals("Here I'm converting the Data Type from Integer to Double.",dataTypeConversion.intToDouble());

        assertEquals("Here I'm converting the Data Type from Char to String.",dataTypeConversion.charToString());
    }

}