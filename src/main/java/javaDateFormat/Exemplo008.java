package javaDateFormat;

import java.text.DateFormat;
import java.util.Date;

public class Exemplo008 {
    public static void main(String[] args) {
        Date agora = new Date();

        String dateToStr = DateFormat.getDateInstance().format(agora);
        System.out.println(dateToStr);

       /* dateToStr = DateFormat.getDateInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);*/

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        System.out.println(dateToStr);
    }
}
