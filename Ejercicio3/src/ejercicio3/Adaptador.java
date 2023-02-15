
package Ejercicio3;

import java.util.ArrayList;

public class Adaptador implements Objetivo{
    private int[] vector;
    private ArrayList<Integer> lista = new ArrayList<>();
    
    @Override
    public void ordena(ArrayList<Integer> a){
        SeleccionDirecta sd = new SeleccionDirecta();
        vector = a.stream().mapToInt(Integer::intValue).toArray();
        sd.ordena(vector);
    }
    public ArrayList<Integer> getSeleccionDirecta(){
        for(int i = 0; i < vector.length; i++){
            lista.add(vector[i]);
        }
        return lista;
    }
}
