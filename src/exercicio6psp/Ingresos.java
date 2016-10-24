package exercicio6psp;



/**
 *
 * @author Yasmin
 */
public class Ingresos extends Thread{
    
    private Caja registro;
    private int inicioCapital = 100;
    private int ingreso;
    
    public Ingresos(Caja registro, int ingreso){
        this.registro = registro;
        this.ingreso = ingreso;
    }
    
    public void run(){
        for (int i=0;i<11;i++){
            ingreso = inicioCapital+i;
            registro.cobrar(ingreso);      
        }
        System.out.println("Ingresos totales: " + ingreso);
    }
}
