package Listas.Exe01;

import java.util.*;

public class Main {

    private List<Integer> listaNums = new ArrayList<>();

    private List<Integer> numeros(int x){
        int contador = 0;
        while (contador <= x){
            int num = (int) (Math.random() * 100);
            listaNums.add(num);
            contador++;
        }
        Collections.sort(listaNums);
        return listaNums;
    }

    public static void main(String[] args) {

        Main l1 = new Main();
        System.out.println(l1.numeros(10));

    }
}
