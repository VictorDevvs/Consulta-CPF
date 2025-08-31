package Arrays;

import java.util.Arrays;

public class ArraysMetodos {
    public static void main(String[] args) {

        String[] array = new String[5];
        array[0] = "D";
        array[1] = "C";
        array[2] = "B";
        array[3] = "E";
        array[4] = "A";
        // ORDENACAO
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        String[] newArray = Arrays.copyOf(array, 10);
        System.out.println(Arrays.toString(newArray));
    }
}
