package Mapas.Exe01;

import java.util.Map;
import java.util.TreeMap;

public class Chars {

    public static   Map<Character, Integer> contaChar(String palavra){
         Map<Character, Integer> kv = new TreeMap<>();
         char[] chars = palavra.toCharArray();
         for (char c : chars){
             int count = kv.getOrDefault(c, 0);
             kv.put(c, count + 1);
         }
         return kv;
    }
}
