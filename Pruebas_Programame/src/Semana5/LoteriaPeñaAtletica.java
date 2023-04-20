package Semana5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LoteriaPeñaAtletica {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            int[] numeros = new int[Integer.parseInt(br.readLine())];
            int contador= 0 ;
            for (int numero: numeros) {
                if (numero % 2 == 0){contador++;}
            }
            System.out.println(contador);
        }
    }
}
