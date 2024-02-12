package com.ohgiraffers.pokemon.grass;

public class Venusaur extends Ivysaur {
    public Venusaur() {
        super();
        this.name = "이상해꽃";
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 꼬옻!꼬옻!!");
    }
}
