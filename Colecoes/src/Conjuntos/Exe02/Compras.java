package Conjuntos.Exe02;

import java.util.*;

public class Compras {
    public static void main(String[] args) {

        List<String> itens = new ArrayList<>();
        itens.add("Feijão");
        itens.add("Arroz");
        itens.add("Queijo");
        itens.add("Feijão");
        itens.add("Azeite");
        itens.add("Arroz");

        Compras.removeDuplicados(itens);
    }

    public static void removeDuplicados(List<String> list){
        Set<String> set = new HashSet<>(list);
        System.out.println(set);
    }

}
