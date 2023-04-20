package Semana5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LaComidadeLosPollitos {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int casos = Integer.parseInt(br.readLine());
        for (int i = 0; i < casos; i++) {
            String[] areaPollos = br.readLine().split(" ");
            int[][] corral = new int[Integer.parseInt(areaPollos[0])][Integer.parseInt(areaPollos[1])];
            for (int j = 0 ; j < Integer.parseInt(areaPollos[2]); j++){
                String[] polloInfo = br.readLine().split(" ");
                corral[Integer.parseInt(polloInfo[0])][Integer.parseInt(polloInfo[1])] +=1;
                for (int x = 0 ; x < Integer.parseInt(polloInfo[3]); x++){

                }
            }
        }
    }
}
