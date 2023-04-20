package Semana5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatizIdentidad {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            int entrada = Integer.parseInt(br.readLine());
            if (entrada== 0) {break;}
            boolean error  = false;
            int[][] matriz = new int[entrada][entrada];
            for (int i = 0; i < entrada; i++) {
                String[] filaNum = br.readLine().split(" ");
                 for (int j = 0; j < matriz.length; j++) {
                    matriz[i][j] = Integer.parseInt(filaNum[j]);
                    if(((i==j && matriz[i][j]!=1)||(i!=j && matriz[i][j]!=0))&& !error){
                        error = true;
                        break;
                    }
                }
                                        
            }
            System.out.println((!error)?"SI":"NO");
        }
    }
}