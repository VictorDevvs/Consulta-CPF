package Mapas.Exe02;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GeraIDS {

    public static void ids(List<PersonRecord> personList){
        Integer id = 0;
        Map<Integer, String> geraIds = new TreeMap<>();
        for (PersonRecord p : personList){
            geraIds.put(id++, p.name());
            System.out.printf("ID = %d | Name = %s\n", id, p.name());
        }
    }
}
