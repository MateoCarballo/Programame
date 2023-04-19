package Semana3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.aceptaelreto.com/problem/statement.php?id=148&cat=8

public class Nochevieja {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] datos = br.readLine().split(":");
            String[] cero = { "00", "00" };
            if (Arrays.equals(datos, cero)) {
                break;
            }
            System.out.println(((23 - Integer.parseInt(datos[0])) * 60) + (60 - Integer.parseInt(datos[1])));
        }
    }
}