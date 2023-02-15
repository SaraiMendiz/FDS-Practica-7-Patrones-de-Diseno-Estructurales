
package Ejercicio1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer {
    private FileWriter fichero;
    private PrintWriter print;
    
    public Writer(String nomArch) throws IOException{
        nomArch = nomArch + ".txt";
        fichero = new FileWriter(nomArch);
        print = new PrintWriter(fichero);
    }
    public void writeChar(char c) throws IOException{
        try{
            int cadena = c;
            cadena += 2;
            print.print((char) cadena);
        }catch(Exception exc){
            System.out.println("Error");
        }
    }
    public void write(String cadena) throws IOException{
        for(int i = 0 ; i < cadena.length(); i++){
            this.writeChar(cadena.charAt(i));
        }
        fichero.close();
    }
}
