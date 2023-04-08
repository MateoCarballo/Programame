package Pruebas_Programame.src.Semana2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//https://www.aceptaelreto.com/problem/statement.php?id=368
public class CociendoHuevos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] datos = br.readLine().split(" ");
            String[] cero = { "0", "0" };
            if (Arrays.equals(datos, cero)) {
                break;
            }

            int huevos = Integer.parseInt(datos[0]);
            int cap = Integer.parseInt(datos[1]);
            System.out.println((int) Math.ceil((double) huevos / cap) * 10);

        }
    }
}
