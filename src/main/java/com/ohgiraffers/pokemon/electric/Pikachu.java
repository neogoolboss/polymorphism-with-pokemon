package com.ohgiraffers.pokemon.electric;


import com.ohgiraffers.pokemon.Pokemon;

public class Pikachu extends Pokemon {

    public Pikachu() {
        super("피카츄", "전기", new String[]{"전기공격", "백만볼트"});
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 피카피카! 담배피카!?");
    }

    public void thunderShock(Pokemon target) {
        System.out.println(name + "이(가) 전기 공격을 합니다!");
    }


}

