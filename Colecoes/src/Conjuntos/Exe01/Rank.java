package Conjuntos.Exe01;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Rank {

    private Set<Player> players = new TreeSet<>(new PlayerComparator());

    public void addPlayer(String name, int score){
        players.add(new Player(name, score));
    }

    public Set<Player> printRanking(){
        return players;
    }

}
