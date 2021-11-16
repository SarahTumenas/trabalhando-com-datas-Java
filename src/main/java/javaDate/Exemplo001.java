package javaDate;

import java.io.OutputStream;
import java.util.Date;

public class Exemplo001 {
    public static void main(String[] args) {

        Long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
    }
}
