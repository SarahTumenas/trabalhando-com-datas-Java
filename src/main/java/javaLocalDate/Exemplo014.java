package javaLocalDate;

import java.time.LocalDateTime;

public class Exemplo014 {
    public static void main(String[] args) {

        LocalDateTime agora = LocalDateTime.now();

        System.out.println(agora);

        LocalDateTime futuro = agora.plusHours(2).plusDays(5).plusMinutes(12);

        System.out.println(futuro);
    }
}
