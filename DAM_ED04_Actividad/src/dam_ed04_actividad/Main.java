/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

public class Main {

/*
    En la solucion al apartado 4 estrictamente seria este metodo...
    public void operativa_cuenta(float cantidad){
    Pero para ser mas flexible a la hora de llamar al metodo se ha optado por el siguiente, 
    aunque se le ha añadido el parametro float cantidad.
*/        
    public void operativa_cuenta(float cantidad, String nombre, String numcuenta, double cuantia, double tipo){
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
        
    }
    
    public static void main(String[] args) {

    }
}
