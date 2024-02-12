package com.ohgiraffers.pokemon.fire;

public class Charmeleon extends Charmander {
    public Charmeleon() {
        super();
        this.name = "리자드";
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 리자드드!");
    }
}
