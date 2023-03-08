
package maquinaExpendedora;

/**
 * La clase MaquinaExpendedoraGonzalezOlivaAntonio2223 Representa una máquina expendedora 
 * de snacks que permite la compra de snacks si se tiene suficiente dinero y hay suficientes unidades en la máquina.
 * @author Antonio González Oliva
 */

public class MaquinaExpendedoraGonzalezOlivaAntonio2223 {// Consideramos máquina snack precio único
    private int unidades;//número de snacks disponbles en la máquina expendora 
    private double precio;//precio actual de un snack
    private double precio_maxGonzalezOlivaAntonio2223;//precio máximo que puede tener un snack

    /**
     * Constructor por defecto
     */
    public MaquinaExpendedoraGonzalezOlivaAntonio2223() {
    
    }
    
    
     /**
     * Constructor por parámetros.
     * @param unidades Número de snacks disponibles en la máquina expendedora.
     * @param precio Precio actual de un snack.
     * @param precio_max Precio máximo que puede tener un snack.
     */
    public MaquinaExpendedoraGonzalezOlivaAntonio2223(int unidades, double precio, double precio_max) {
        this.unidades = unidades;
        this.precio = precio;
        this.precio_maxGonzalezOlivaAntonio2223 = precio_max;
    }
    
    /**
     * Método que devuelve el número de snacks que tiene la máquina.
     * @return Número de snacks disponibles en la máquina expendedora.
     */
    public int obtenerUnidades() {
        return this.unidades;
    }

    /**
     * Método que devuelve el precio que tiene cada snack.
     * @return Precio actual de un snack.
     */
    public double obtenerPrecio() {
        return this.getPrecio();
    }
    
     /**
     * Método que permite modificar el número de snacks disponibles en la máquina expendedora.
     * @param unidades Número de snacks disponibles en la máquina expendedora.
     */
    public void modificarUnidades(int unidades) {
        this.unidades = unidades;
    }
    
     /**
     * Método que permite aumentar el precio de venta de los snacks en la máquina expendedora.
     * @param aumento Aumento del precio de venta de los snacks en la máquina expendedora.
     * @throws Exception Si el aumento es menor o igual a 0 o si el precio máximo de venta se sobrepasa.
     */
    public void aumentarPrecio(double aumento) throws Exception {
        if (aumento <= 0) {
            throw new Exception("El aumento debe ser positivo");
        }
        if (getPrecio_maxGonzalezOlivaAntonio2223() < getPrecio() + aumento) {
            throw new Exception("No se puede superar el precio máximo");
        }
        setPrecio(getPrecio() + aumento);
    }
    
       
    
     /**
     * Método que permite obtener snacks de la máquina expendedora si se tiene suficiente dinero y hay suficientes unidades disponibles.
     * @param unidades Número de snacks a obtener de la máquina expendedora.
     * @param dinero Cantidad de dinero a introducir para la compra de los snacks.
     * @param regaloGonzalezOlivaAntonio2223 Nombre del regalo que se incluirá con la compra de los snacks.
     * @throws Exception Si el dinero es menor o igual a 0, si no hay suficiente dinero para la compra de los snacks, si el número de snacks a obtener
     * es mayor que el de las unidades disponibles.
     */
    public void sacarsnack(int unidades, double dinero, String regaloGonzalezOlivaAntonio2223) throws Exception {
        if (dinero <= 0) {
            throw new Exception("No puede introducirse un valor negativo para el dinero");
        }
        if (dinero < (unidades * getPrecio())) {
            throw new Exception("No tiene suficiente dinero");
        }
        if (unidades <= 0) {
            throw new Exception("La cantidad de snacks no puede ser negativa");
        }
        if (this.unidades <= unidades) {
            throw new Exception("No hay suficientes snack en la máquina");
        }
        this.modificarUnidades(this.obtenerUnidades() - unidades);
    }

    /**
     * Método que devuelve el precio del snack
     * @return el precio del Snack
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Método que establece el preciod el snack
     * @param precio establece el precio del snack
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Método que devuelve el precio máximo del sanck
     * @return el precio máximo del snack
     */
    public double getPrecio_maxGonzalezOlivaAntonio2223() {
        return precio_maxGonzalezOlivaAntonio2223;
    }

    /**
     * Método que establece el precio máximo del snack
     * @param precio_maxGonzalezOlivaAntonio2223 establece el precio máximo del snack
     */
    public void setPrecio_maxGonzalezOlivaAntonio2223(double precio_maxGonzalezOlivaAntonio2223) {
        this.precio_maxGonzalezOlivaAntonio2223 = precio_maxGonzalezOlivaAntonio2223;
    }

}
