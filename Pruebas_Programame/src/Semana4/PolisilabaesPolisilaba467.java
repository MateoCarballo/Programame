package Semana4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PolisilabaesPolisilaba467 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] palabras = br.readLine().split(" es ");
            System.out.println((palabras[0].equalsIgnoreCase(palabras[1])
                    ? "TAUTOLOGIA"
                    : "NO TAUTOLOGIA"));
        }
    }
}
