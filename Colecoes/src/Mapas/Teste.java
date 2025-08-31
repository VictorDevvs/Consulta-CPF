package Mapas;

import java.util.*;

public class Teste {

    public static void main(String[] args) {

//        Map<String, String> ids = new HashMap<>();
//        ids.put("123.456.789-08", "José de Oliveira");
//        System.out.println(ids);

          Map<String, Integer> players = new LinkedHashMap<>();
          players.put("P1", 12);
          players.put("P2", 18);
          players.put("P3", 43);

//          Set<String> keys = players.keySet();
//          ITERANDO SOBRE AS CHAVES
//          for (String key : keys){
//              System.out.println(key);
//          }
//
//          Collection<Integer> values = players.values();
//          ITERANDO SOBRE OS VALORES
//          for (Integer value : values){
//              System.out.println(value);
//          }

          var entries = players.entrySet();

          for (var entry : entries){
              System.out.println(entry);
          }
    }

}
