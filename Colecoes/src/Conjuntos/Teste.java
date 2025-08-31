package Conjuntos;

import java.util.HashSet;
import java.util.Set;

public class Teste {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();
        set.add("João");
        set.add("Victor");
        set.add("Carol");

        for (String s : set){
            System.out.println(s);
        }

        // set.addAll() adiciona uma colecao ao set
        // set.contains() verifica se determinado objeto existe no set

    }
}
