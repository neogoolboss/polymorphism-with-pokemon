package com.ohgiraffers.pokemon.water;

public class Wartortle extends Squirtle {
    public Wartortle() {
        super();
        this.name = "어니부기";
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 어니!?!");
    }
}
