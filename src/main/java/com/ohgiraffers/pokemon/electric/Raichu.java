package com.ohgiraffers.pokemon.electric;


public class Raichu extends Pikachu {
    public Raichu() {
        super();
        this.name = "라이츄";
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 라이츄우!");
    }

}
