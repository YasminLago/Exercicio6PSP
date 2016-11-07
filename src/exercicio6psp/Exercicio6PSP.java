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
        Ingresos i1 = new Ingresos(c,0);
        Ingresos i2 = new Ingresos(c,0);
        Ingresos i3 = new Ingresos(c,0);
        Ingresos i4 = new Ingresos(c,0);
        Ingresos i5 = new Ingresos(c,0);
        Ingresos i6 = new Ingresos(c,0);
        Ingresos i7 = new Ingresos(c,0);
        Ingresos i8 = new Ingresos(c,0);
        Ingresos i9 = new Ingresos(c,0);
        Ingresos i10 = new Ingresos(c,0);
        
        Extracciones e1 = new Extracciones(c,0);
        Extracciones e2 = new Extracciones(c,0);
        Extracciones e3 = new Extracciones(c,0);
        Extracciones e4 = new Extracciones(c,0);
        Extracciones e5 = new Extracciones(c,0);
        
        i1.start();
        i2.start();
        i3.start();
        i4.start();
        i5.start();
        i6.start();
        i7.start();
        i8.start();
        i9.start();
        i10.start();
        
        e1.start();
        e2.start();
        e3.start();
        e4.start();
        e5.start();
    }
    
}
