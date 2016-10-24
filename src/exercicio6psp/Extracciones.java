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
        for (int i=0;i<5;i++){
            pago+=i;
            registro.pagar(pago);      
        }
        System.out.println("Pagos totales: " + pago);
    }
}
