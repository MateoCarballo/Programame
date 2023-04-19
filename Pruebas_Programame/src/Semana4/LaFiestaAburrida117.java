package Semana4;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LaFiestaAburrida117 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] entrada = br.readLine().split(" ");
            System.out.println("Hola, " + entrada[1] + ".");
        }
    }
}
