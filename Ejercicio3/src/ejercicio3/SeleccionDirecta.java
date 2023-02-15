
package Ejercicio3;

public class SeleccionDirecta {
     public int[] ordena(int[] vector){
        int m;
        for (int i=0; i<vector.length-1; i++) {
            m = i;
            for (int j=i+1; j<vector.length; j++){
                if (vector[j]<vector[m]){
                    m = j;
                    int aux = vector[i];
                    vector[i] = vector[m];
                    vector[m] = aux;
                }
            }
        }
        return vector;
    }
}
