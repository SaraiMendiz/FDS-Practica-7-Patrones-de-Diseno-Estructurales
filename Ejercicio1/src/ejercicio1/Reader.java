
package Ejercicio1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    private String nombre_archivo;
    private boolean error = false;
    
    public Reader(String nomArch){
        this.nombre_archivo = nomArch + ".txt";
    }
    public String read() throws IOException{
        String nomArch = "";
        try{
            FileReader file = new FileReader(this.nombre_archivo);
            BufferedReader buffer = new BufferedReader(file);
            
            int i = 0;
            while(i != -1){
                i = buffer.read();
                nomArch = nomArch + ((char)(i - 2));
            }
        }catch(Exception exc){
            System.out.println("Error - El fichero no existe");
            this.error = true;
        }
        return nomArch.substring(0,nomArch.length()-1);
    }
}
