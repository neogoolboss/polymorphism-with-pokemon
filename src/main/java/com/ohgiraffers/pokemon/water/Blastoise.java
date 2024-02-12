package com.ohgiraffers.pokemon.water;

public class Blastoise extends Wartortle {
    public Blastoise() {
        super();
        this.name = "거북왕";
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 그어부억와아앙!");
    }
}
