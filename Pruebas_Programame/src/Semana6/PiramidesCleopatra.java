package Semana6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PiramidesCleopatra{
    public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int casos = Integer.parseInt(br.readLine());
    for (int i = 0; i < casos; i++) {
        String[] anos =  br.readLine().split(" ");
        
        int diferencia1 =(Integer.parseInt(anos[0]) - Integer.parseInt(anos[1])) - ((Integer.parseInt(anos[0])*Integer.parseInt(anos[1])<0)?1:0) ;
        int diferencia2 =(Integer.parseInt(anos[2]) - Integer.parseInt(anos[1])) - ((Integer.parseInt(anos[2])*Integer.parseInt(anos[1])<0)?1:0) ;

        if(diferencia1<0){
            diferencia1*=-1;
        }

        if(diferencia2<0){
            diferencia2*=-1;
        }
        if((diferencia1)>(diferencia2)){System.out.println(anos[2]);}
        if((diferencia2)>(diferencia1)){System.out.println(anos[0]);}
        if(!((diferencia1)>(diferencia2))||!((diferencia2)>(diferencia1))){System.out.println("EMPATE");}       
        }
    } 
}


/**
 * if(Math.abs(diferencia1)>Math.abs(diferencia2)){System.out.println(anos[2]);}
                else if(Math.abs(diferencia2)>Math.abs(diferencia1)){System.out.println(anos[0]);}
                else{System.out.println("EMPATE");}
 */
