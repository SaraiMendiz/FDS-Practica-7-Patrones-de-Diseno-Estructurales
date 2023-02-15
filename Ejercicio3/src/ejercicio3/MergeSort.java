
package Ejercicio3;

import java.util.ArrayList;
import java.util.Collections;

public class MergeSort implements Objetivo{
     private ArrayList <Integer> v;
 
    @Override
    public void ordena (ArrayList <Integer> a){
        Collections.sort(a);
        v = new ArrayList<>(a);
    }
    
    public ArrayList getMerge(){
        return v;
    }
}
