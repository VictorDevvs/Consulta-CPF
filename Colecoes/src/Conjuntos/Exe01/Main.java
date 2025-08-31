package Conjuntos.Exe01;

public class Main {

    public static void main(String[] args) {

        Rank rank = new Rank();;
        rank.addPlayer("Victor", 10);
        rank.addPlayer("João", 13);
        rank.addPlayer("Carol", 19);
        rank.addPlayer("José", 2);
        System.out.println(rank.printRanking());

    }
}
