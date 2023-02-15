
package Ejercicio2;

public class Fachada {
    private Impresora impresora;
    
    public Fachada(Impresora impresora){
        this.impresora = impresora;
    }
    
    public void imprimeLujo(String txt){
        impresora.setTipoHoja("A4");
        impresora.setColor(true);
        impresora.setBorrador(false);
        impresora.setOrdena(true);
        impresora.setGrapa(true);
        impresora.setTexto(txt);
        impresora.imprimirDocumento();
    }
    public void imprimeBorrador(String txt){
        impresora.setTipoHoja("B5");
        impresora.setColor(false);
        impresora.setBorrador(true);
        impresora.setTexto(txt);
        impresora.imprimirDocumento();
    }
}
