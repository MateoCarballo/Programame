package Semana4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EspionajeEnNavidad364 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String entrada = br.readLine();
            String salida = "";
            if (entrada.equalsIgnoreCase("FIN")) {
                break;
            }
            for (char c : entrada.toCharArray()) {
                salida += (char) (((c - 'A' + 1) % 26) + 'A');
            }
            System.out.println(salida.replaceAll(";", " "));
        }
    }

}
