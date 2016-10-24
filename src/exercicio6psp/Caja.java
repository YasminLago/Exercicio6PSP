package exercicio6psp;

/**
 *
 * @author Yasmin
 */
public class Caja {
    
    int cliente;
    int proveedor;
    boolean dinero = true;
    
    public synchronized void cobrar(int cliente) {
        while(dinero == false){
          try {
            wait();
        } catch (InterruptedException e) { }
        }
        dinero = true;
        notifyAll();
    }
    
    public synchronized void pagar(int proveedor) {
        while(dinero == false){
          try {
            wait();
        } catch (InterruptedException e) { }
        }
        dinero = true;
        notifyAll();
    }
    
}
