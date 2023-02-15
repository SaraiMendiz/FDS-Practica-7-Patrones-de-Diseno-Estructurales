
package Ejercicio2;

import java.util.Scanner;

public class Cliente {
    public static void main(String[] args){
        Impresora impresora = new Impresora();
        Fachada f = new Fachada(impresora);
        Scanner sc = new Scanner(System.in);
        String texto;
        
        System.out.println("Introduzca texto: ");
        texto = sc.nextLine();
        System.out.println("\nLujo: ");
        f.imprimeLujo(texto);
        System.out.println("\nBorrador: ");
        f.imprimeBorrador(texto);
        System.out.println("\nTexto cualquiera: ");
        impresora.setGrapa(true);
        impresora.setTipoHoja("A3");
        impresora.setTexto(texto);
        impresora.imprimirDocumento();
        
    }
}
