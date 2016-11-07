package exercicio6psp;

/**
 *
 * @author Yasmin
 */
public class Caja {
    
    int inicioCapital= 100; // Dinero existente en la Caja
    boolean dinero = true; 
     
    /**
     * Recoge la cantidad ingreada y se la suma al capital inicial 
     * @param cliente Ingresos en Caja
     */
    public synchronized void cobrar(int cliente) {
        while(dinero == false){ //Mientras el dinero sea igual a false tendra que esperar
          try {
            wait();
        } catch (InterruptedException e) { }
        }
        inicioCapital+=cliente;
        System.out.println("Ingresos: "+inicioCapital);
        dinero = true; //Cuando el dinero sea igual a true avisará al resto y podrán hacer uso del dinero
        notify();
    }
    
    /**
     * Recoge la cantidad extraida y se la resta al capital inicial
     * @param proveedor Número de extracciones que se hacen de la caja
     */
    public synchronized void pagar(int proveedor) {
        while(dinero == false){
          try {
            wait();
        } catch (InterruptedException e) { }
        }
        inicioCapital-=proveedor; 
        System.out.println("Extracciones: "+inicioCapital);
        dinero = true;
        notify();
    }
    
}
