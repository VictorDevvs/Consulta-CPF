package Arrays;

public class ArrayMultidimensional {

    public static void main(String[] args) {

        int[][] a1 = {{1, 2}, {2, 3}};

        for (int i = 0; i < a1.length; i++){
            for (int j = 0; j < a1.length; j++){
                System.out.print(i +"° linha | " + j + "° coluna => " + a1[i][j] + " --- ");
                }
            System.out.println();
        }
    }
}
