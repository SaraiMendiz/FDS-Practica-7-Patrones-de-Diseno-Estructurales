
package Ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

public class Cliente {
     public static void main(String[] args){
        
        ArrayList<Integer> array = new ArrayList<>();

        System.out.println("Introduzca el numero de elementos");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        for(int i=0; i<numero; i++){
            System.out.println("Introduzca el elemento nº "+i);
            array.add(sc.nextInt());
        }
        
        Adaptador adpt = new Adaptador();
        adpt.ordena(array);
        ArrayList<Integer> sd = new ArrayList<>(adpt.getSeleccionDirecta());
        System.out.println("\nSeleccion Directa");
        for(int dd : sd){
            System.out.println(dd);
        }
        MergeSort merge = new MergeSort();
        merge.ordena(array);
        System.out.println("\nMerge sort");
        for(int i=0; i<merge.getMerge().size();i++){
            System.out.println(merge.getMerge().get(i));
        }
    }
}
