package com.ohgiraffers.run;


import com.ohgiraffers.pokemon.Pokemon;
import com.ohgiraffers.pokemon.electric.Pikachu;
import com.ohgiraffers.pokemon.electric.Raichu;
import com.ohgiraffers.pokemon.fire.Charizard;
import com.ohgiraffers.pokemon.fire.Charmander;
import com.ohgiraffers.pokemon.fire.Charmeleon;
import com.ohgiraffers.pokemon.grass.Bulbasaur;
import com.ohgiraffers.pokemon.grass.Ivysaur;
import com.ohgiraffers.pokemon.grass.Venusaur;
import com.ohgiraffers.pokemon.water.Blastoise;
import com.ohgiraffers.pokemon.water.Squirtle;
import com.ohgiraffers.pokemon.water.Wartortle;

public class Application {

    public static void main(String[] args) {

        Pokemon pokemon = new Pokemon();
        Pikachu pikachu = new Pikachu();
        Raichu raichu = new Raichu();
        Charmander charmander = new Charmander();
        Charmeleon charmeleon = new Charmeleon();
        Charizard charizard = new Charizard();
        Bulbasaur bulbasaur = new Bulbasaur();
        Ivysaur ivysaur = new Ivysaur();
        Venusaur venusaur = new Venusaur();
        Squirtle squirtle = new Squirtle();
        Wartortle wartortle = new Wartortle();
        Blastoise blastoise = new Blastoise();

        System.out.println("==========포켓몬 생성==========");
        pokemon.attack(pikachu);
        pokemon.cry();

        System.out.println("==========피카츄 생성==========");
        pikachu.attack(squirtle);
        pikachu.cry();
        pikachu.thunderShock(squirtle);

        System.out.println("==========파이리 생성==========");
        charmander.attack(bulbasaur);
        charmander.cry();
        charmander.ember(bulbasaur);

        System.out.println("==========타입 형변환 확인===========");
        Pokemon a1 = new Pikachu(); // up-casting
        Pokemon a2 = new Charmander(); // up-casting

        System.out.println("==========동적바인딩 확인===============");
        a1.cry();
        a2.cry();

        System.out.println("==========클래스타입 형변환 확인===========");
        ((Pikachu) a1).thunderShock(charizard); // down-casting
        ((Charmander) a2).ember(raichu); // down-casting

        System.out.println("==========instanceof 연산자 사용 확인===========");
        System.out.println("a1이 Pikachu 타입인지 확인 : " + (a1 instanceof Pikachu));
        System.out.println("a1이 Charmander 타입인지 확인 : " + (a1 instanceof Charmander));
        System.out.println("a1이 Pokemon 타입인지 확인 : " + (a1 instanceof Pokemon));

        if (a1 instanceof Pikachu) {
            ((Pikachu) a1).thunderShock(ivysaur);
        }

        if (a1 instanceof Charmander) {
            ((Charmander) a1).ember(blastoise);
        }
    }


}






