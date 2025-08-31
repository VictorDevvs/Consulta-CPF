package Arrays.Exe01;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Main.array(array1);

    }

    private static void array(int[] numeros){
        int quadrado = 0;
        for (int i = 0; i < numeros.length; i++){
            quadrado = (int) Math.pow(numeros[i], 2);
            System.out.println(numeros[i] + "² = " + quadrado);
        }
    }
}
