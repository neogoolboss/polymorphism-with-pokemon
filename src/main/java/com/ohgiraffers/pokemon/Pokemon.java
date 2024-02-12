package com.ohgiraffers.pokemon;

public class Pokemon {

    protected String name;
    protected String type;
    protected String[] skills;
    protected boolean evolved;

    public Pokemon() {

    }
    public Pokemon(String name, String type, String[] skills) {
        this.name = name;
        this.type = type;
        this.skills = skills;
        this.evolved = false;
    }

    public void attack(Pokemon target) {
        System.out.println(name + "이(가) " + target.name + "에게 공격합니다!");
    }

    public void cry() {
        System.out.println(name + "의 울음소리: 포켓포켓!");
    }

    public void evolve() {
        System.out.println(name + "이(가) 진화했습니다!");
        evolved = true;
    }

}
