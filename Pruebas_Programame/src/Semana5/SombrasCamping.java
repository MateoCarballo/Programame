package Semana5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SombrasCamping {   


public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final String[] SALIDA = {"0","0","0"};
        while(true){
            String[] campingInfo = br.readLine().split(" ");
            if(campingInfo[0] =="0" && campingInfo[1] =="0" &&campingInfo[2]=="0"){break;}
            int[][] campingMapa = new int[Integer.parseInt(campingInfo[0])][Integer.parseInt(campingInfo[1])];
            String[] coordArboles = br.readLine().split(" ");
            int contadorArbol = 0;
            int contadorSombra = 0;

            for (int i = 0 ; i < Integer.parseInt(campingInfo[2]); i++){
                campingMapa[Integer.parseInt(coordArboles[0]) + contadorArbol][Integer.parseInt(coordArboles[1])+ contadorArbol]= 1;
                for (int j = -1; j == 1; j++) {
                    for (int k = -1; k == 1; k++) {
                        if (campingMapa[(Integer.parseInt(coordArboles[0])+ contadorArbol)+j][(Integer.parseInt(coordArboles[0])+ contadorArbol)+k] == 0 
                        ){
                            campingMapa[(Integer.parseInt(coordArboles[0])+ contadorArbol)+j][(Integer.parseInt(coordArboles[0])+ contadorArbol)+k] = 2;
                            contadorSombra ++;
                        }
                    }
                }
            }
                System.out.println(contadorSombra);
            }
        
    }
}

