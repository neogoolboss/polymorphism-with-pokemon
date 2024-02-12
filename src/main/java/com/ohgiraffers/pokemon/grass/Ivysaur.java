package com.ohgiraffers.pokemon.grass;

public class Ivysaur extends Bulbasaur {
    public Ivysaur() {
        super();
        this.name = "이상해풀";
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 풀!풀!");
    }
}
