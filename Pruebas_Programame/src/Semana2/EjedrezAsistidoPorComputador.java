package Semana2;

import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;

//https://www.aceptaelreto.com/problem/statement.php?id=481
public class EjedrezAsistidoPorComputador {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            String[] datos = br.readLine().split(" ");
            String[] cero = { "0", "0" };
            if (Arrays.equals(datos, cero)) {
                break;
            }
            switch (datos[0]) {
                case "1":
                    System.out.println("h" + datos[1]);
                    break;
                case "2":
                    System.out.println("g" + datos[1]);
                    break;
                case "3":
                    System.out.println("f" + datos[1]);
                    break;
                case "4":
                    System.out.println("e" + datos[1]);
                    break;
                case "5":
                    System.out.println("d" + datos[1]);
                    break;
                case "6":
                    System.out.println("c" + datos[1]);
                    break;
                case "7":
                    System.out.println("b" + datos[1]);
                    break;
                case "8":
                    System.out.println("a" + datos[1]);
                    break;
            }
        }
    }
}