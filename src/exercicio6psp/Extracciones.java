package exercicio6psp;

/**
 *
 * @author Yasmin
 */
public class Extracciones extends Thread{
    
    private Caja registro;
    private int pago;
    
    
    public Extracciones(Caja registro, int ingreso){
        this.registro = registro;
        this.pago = ingreso;
    }
    
    public void run(){
        pago++;
        registro.pagar(pago);
        try {
            sleep( (int)(Math.random() * 2000 ) );
        } catch( InterruptedException e ) {;}
        
        
    }
}
