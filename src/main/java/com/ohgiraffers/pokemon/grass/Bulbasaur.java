package com.ohgiraffers.pokemon.grass;

import com.ohgiraffers.pokemon.Pokemon;

public class Bulbasaur extends Pokemon {
    public Bulbasaur() {
        super("이상해씨", "풀", new String[]{"덩쿨채찍", "씨뿌리기"});
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 씨씨!!!");
    }

    public void vineWhip(Pokemon target) {
        System.out.println(name + "이(가) 덩쿨채찍으로 공격합니다!");
    }

}
