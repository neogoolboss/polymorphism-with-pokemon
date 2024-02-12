package com.ohgiraffers.pokemon.fire;

import com.ohgiraffers.pokemon.Pokemon;

public class Charmander extends Pokemon {

    public Charmander() {
        super("파이리", "불", new String[]{"불꽃세례", "파이어스핀"});
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 파이리리!");
    }

    public void ember(Pokemon target) {
        System.out.println(name + "이(가) 재를 내뿜어 공격합니다!");
    }

}
