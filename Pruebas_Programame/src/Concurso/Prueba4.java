package Concurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prueba4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        ArrayList<String> clientes = new ArrayList<>();
        for (int i = 0; i < casos; i++) {
            clientes.add(br.readLine());
        }

    }
}
