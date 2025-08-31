package Arrays;

public class VarArgs {

    private static int sum(int[] numeros){
        int soma = 0;
        for (int n : numeros){
            soma += n;
        }
        return soma;
    }

    //USANDO VAR ARGS COMO PARAMETRO -> ...
    private static int sum2(int... numeros){
        int soma = 0;
        for (int n : numeros){
            soma += n;
        }
        return soma;
    }

    public static void main(String[] args) {
        int sum = sum(new int[]{2, 3, 4});
        System.out.println(sum);
        int sum2 = sum2(1, 4, 3);
        System.out.println(sum2);
    }
}
