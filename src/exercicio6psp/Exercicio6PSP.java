/*
Simular una caja de una empresa con dos hilos. Uno simulará el ingreso, 
con la compra de artículos por parte de clientes  y el otro la extracción de dinero 
de la caja con el pago a proveedores. La cuenta tendrá un capital inicial. 
Realizar 10 ingresos y 5 extracciones.
 */
package exercicio6psp;

/**
 *
 * @author Yasmin
 */
public class Exercicio6PSP {

    public static void main(String[] args) {
        Caja c = new Caja();
        Ingresos i = new Ingresos(c,1);
        Extracciones e = new Extracciones(c,1);
        i.start();
        e.start();
    }
    
}
