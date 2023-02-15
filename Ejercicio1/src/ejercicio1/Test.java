
package Ejercicio1;

import java.io.IOException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        CriptoReader cr = new CriptoReader();
        CriptoWriter cw = new CriptoWriter();
        int opcion = 0;
        String nombreFichero;
        String mensaje;
        
        do{
           System.out.println("\nPatrón Decorador: ");
           System.out.println("0º- Salir");
           System.out.println("1º- Crear Fichero");
           System.out.println("2º- Leer Fichero");
           opcion = sc.nextInt();
           nombreFichero = "";
           mensaje = "";
           switch (opcion){
               case 0: break;
               
               case 1: System.out.println("Introduzca el nombre del fichero: ");
                       String x = sc.nextLine();
                       nombreFichero = sc.nextLine();
                       System.out.println("Introduzca un mensaje: ");
                       mensaje = sc.nextLine();
                       cw.escribir(nombreFichero,mensaje);
                       System.out.println("El fichero cifrado ha sido creado correctamente");
                       break;
               case 2: System.out.println("Introduzca el nombre del fichero: ");
                       String y = sc.nextLine();
                       nombreFichero = sc.nextLine();
                       System.out.println("Mensaje descifrado: \n" + cr.leer(nombreFichero));
                       break;
                       
           }
        }while(opcion != 0);
    }
}
