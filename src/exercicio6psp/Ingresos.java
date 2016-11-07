package exercicio6psp;

/**
 *
 * @author Yasmin
 */
public class Ingresos extends Thread{
    
    private Caja registro;
    private int ingreso;

    
    public Ingresos(Caja registro, int ingreso){
        this.registro = registro;
        this.ingreso = ingreso;
    }
    
    public void run(){     
        ingreso++;
        registro.cobrar(ingreso);  
        try {
             sleep( (int)(Math.random() * 2000 ) );
        } catch( InterruptedException e ) {;}
    }
}
