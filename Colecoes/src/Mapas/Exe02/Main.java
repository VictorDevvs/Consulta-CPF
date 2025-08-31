package Mapas.Exe02;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        var listPersons = List.of(
                new PersonRecord("João"),
                new PersonRecord("Victor"),
                new PersonRecord("José"),
                new PersonRecord("Carol")
        );

        GeraIDS.ids(listPersons);

    }

}
