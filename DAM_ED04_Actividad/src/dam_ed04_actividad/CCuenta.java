/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dam_ed04_actividad;

/**
 * Clase CCuenta para la gestión de una cuenta corriente, con metodo de ingreso y retirada de saldo,
 * con atributos:
 *  private String nombre;
 *  private String cuenta;
 *  private double saldo;
 *  private double tipoInterés;
 * 
 * @author DAM_ED04_Actividad modificado por Francisco C. Gil Rey
 */
public class CCuenta {

    /**
     * @return the cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Contructor simple.
     */
    public CCuenta()
    {
    }

    /**
     * Constructor con los atributos:
     * @param nom
     * @param cue
     * @param sal
     * @param tipo 
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

    /**
     * 
     * @param nom 
     */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }

    /**
     * 
     * @return String nombre
     */
    public String obtenerNombre()
    {
        return getNombre();
    }

    /**
     * 
     * @return double saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para realizar un ingreso. Devuelve una excepcion si el ingreso es negativo
     * @param cantidad
     * @throws Exception 
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para retirar una cantidad de la cuenta. Devuelve una excepcion si la cantidad
     * a retirar es negativa o no hay suficiente saldo.
     * @param cantidad
     * @throws Exception 
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }


    /**
     * Obtiene el numero de cuenta en una cadena
     * @return String cuenta
     */
    public String obtenerCuenta()
    {
        return getCuenta();
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el tipo de interes
     * @return double tipo
     */
    public double getTipoInterés() {
        return tipoInterés;
    }


    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
