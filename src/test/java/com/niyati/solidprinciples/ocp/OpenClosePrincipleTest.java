package com.niyati.solidprinciples.ocp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class OpenClosePrincipleTest {

    @Test
    void testOpenClosePrinciple() {

        ArithmeticOperations operations1 = new AddOperation();
        assertEquals(10, operations1.doOperation(3, 7));

        ArithmeticOperations operations2 = new SubtractOperation();
        assertEquals(-4, operations2.doOperation(3, 7));

        ArithmeticOperations operations3 = new MultiplyOperation();
        assertEquals(21, operations3.doOperation(3, 7));

    }

}