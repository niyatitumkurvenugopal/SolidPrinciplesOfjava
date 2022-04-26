package com.niyati.solidprinciples.lsp;

public class Penguin extends NonFlyingBird {

    @Override
    public String cannotFly() {
        return "I am Penguin ,I cannot Fly.";
    }

    @Override
    public String eat() {
        return "I am Penguin ,I can eat.";
    }
}
