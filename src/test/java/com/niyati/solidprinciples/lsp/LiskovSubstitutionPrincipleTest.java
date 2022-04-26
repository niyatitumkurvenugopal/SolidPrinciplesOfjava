package com.niyati.solidprinciples.lsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LiskovSubstitutionPrincipleTest {
    @Test
    void testLiskovSubstitution() {
        FlyingBird swan = new Swan();
        assertEquals("I am Swan ,I can fly.", swan.fly());
        assertEquals("I am Swan ,I can eat.", swan.eat());

        NonFlyingBird penguin = new Penguin();
        assertEquals("I am Penguin ,I cannot Fly.", penguin.cannotFly());
        assertEquals("I am Penguin ,I can eat.", penguin.eat());

    }
}