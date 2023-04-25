package Concurso;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Prueba5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int co = Integer.parseInt(br.readLine());
        int[] ids = new int[10000];
        ArrayList<Integer> idsUsadas = new ArrayList<>();
        while(true){
            String entrada = br.readLine();
            if(entrada.equals("0 0")){
                int max = 1;
                int min = 1000000;
                for (int i = 0; i < ids.length; i++) {
                    if(ids[i]> max){
                        max = ids[i];
                    }
                    if(ids[i] < min && idsUsadas.contains(i)){
                        min = ids[i];
                    }
                }
                for (int i = 0; i < ids.length; i++) {
                    if (ids[i]==max){
                        System.out.print(i + " ");
                    }
                }
                System.out.println();
                for (int i = 0; i < ids.length; i++) {
                    if (ids[i]==min && idsUsadas.contains(i)){
                        System.out.print(i + " ");
                    }
                }
                break;
            }
            String[] entradaSeparada = entrada.split(" ");
            if(Integer.parseInt(entradaSeparada[1])>co) {
                ids[Integer.parseInt(entradaSeparada[0])]++;
            }
            idsUsadas.add(Integer.parseInt(entradaSeparada[0]));
        }
    }
}
