package com.niyati.solidprinciples.lsp;

public class Swan extends FlyingBird {

    @Override
    public String fly() {
        return "I am Swan ,I can fly.";
    }

    @Override
    public String eat() {
        return "I am Swan ,I can eat.";
    }
}
