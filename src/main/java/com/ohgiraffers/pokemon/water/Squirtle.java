package com.ohgiraffers.pokemon.water;

import com.ohgiraffers.pokemon.Pokemon;

public class Squirtle extends Pokemon {

    public Squirtle() {
        super("꼬부기", "물", new String[]{"물대포", "거품"});
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 꼬북 꼬북~?!");
    }

    public void waterGun(Pokemon target) {
        System.out.println(name + "이(가) 물대포로 공격합니다!");
    }
}
