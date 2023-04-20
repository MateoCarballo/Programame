package Semana3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ContarHastaElFinal441 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder a = new StringBuilder();
        StringBuilder compuesto = new StringBuilder();
        String[] entrada = br.readLine().split("\\.");
        for (String numero : entrada) {
            compuesto.append(numero);
        }
        a.append(Integer.parseInt(compuesto.toString()) + 1);
        a.reverse();
        for (int j = 3; j < a.length(); j = j + 4) {
            a.insert(j, '.');
        }
        System.out.println(a.reverse());

    }
}
