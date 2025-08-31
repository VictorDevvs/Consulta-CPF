package Arrays.Exe02;

import java.util.Arrays;

public class Item {

    private String name;
    private double price;

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    private static void infos(Item[] items){
         double menorPreco = items[0].getPrice();
         double maiorPreco = items[0].getPrice();
         double somaPrecos = 0;

         for (Item item : items){
             double preco = item.getPrice();

             if (preco < menorPreco){
                 menorPreco = preco;
             } if (preco > maiorPreco){
                 maiorPreco = preco;
             }

             somaPrecos += preco;
         }
         double mediaPrecos = somaPrecos / items.length;
         System.out.printf("Maior preço: R$ %.2f%n", maiorPreco);
         System.out.printf("Menor preço: R$ %.2f%n", menorPreco);
         System.out.printf("Média dos preços: R$ %.2f%n ", mediaPrecos);
    }

    public static void main(String[] args) {
        Item[] items = {
                new Item("Caneta", 1.50),
                new Item("Lápis", 1.00),
                new Item("Camisa", 25.99)
        };
        infos(items);
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
