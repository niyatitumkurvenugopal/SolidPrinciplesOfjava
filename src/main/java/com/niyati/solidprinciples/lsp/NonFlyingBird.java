package com.niyati.solidprinciples.lsp;

public class NonFlyingBird extends Bird {

    public static final String I_CANNOT_FLY = "I cannot fly";

    public String cannotFly() {
        return I_CANNOT_FLY;
    }
}
