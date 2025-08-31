package Mapas.Exe01;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();
        System.out.println(Chars.contaChar(palavra));

    }
}
