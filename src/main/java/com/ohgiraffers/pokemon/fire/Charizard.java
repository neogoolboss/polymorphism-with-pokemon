package com.ohgiraffers.pokemon.fire;

public class Charizard extends Charmeleon {
    public Charizard() {
        super();
        this.name = "리자몽";
    }

    @Override
    public void cry() {
        System.out.println(name + "의 울음소리: 리자모옹!!!");
    }

}
