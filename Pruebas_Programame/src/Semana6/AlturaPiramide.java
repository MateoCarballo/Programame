package Semana6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class AlturaPiramide {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int bloques = Integer.parseInt(br.readLine());
            int pisos = 1;
            int bloquesPiso = 9;
            if (bloques == 0) {
                break;
            }
            while (true) {
                if (bloques / bloquesPiso != 0) {
                    bloquesPiso += (8 * pisos);
                    pisos++;
                } else {
                    System.out.println(pisos);
                    break;
                }
            }
        }
    }
}

// 1*1 +(3*3-(1*1))+(5*5-(3*3))