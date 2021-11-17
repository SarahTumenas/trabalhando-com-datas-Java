package javaLocalDate;

import java.time.LocalTime;

public class Exemplo013 {

    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();

        System.out.println(agora);

        LocalTime maisUmaHora = agora.plusHours(1);

        System.out.println(maisUmaHora);

        LocalTime maisTresHoras = agora.plusHours(3);

        System.out.println(maisTresHoras);
    }
}
