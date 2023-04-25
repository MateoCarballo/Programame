package Concurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prueba1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] datos = br.readLine().split(" ");
        int clara = Integer.parseInt(datos[0]);
        int vecinos = Integer.parseInt(datos[1]);
        int cont = 0;
        while(true){
            if (clara < vecinos){
                clara = clara * 3;
                vecinos = vecinos * 2;
                cont++;
            }else{
                System.out.println(cont);
                break;
            }
        }
    }
}
