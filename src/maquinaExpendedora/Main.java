/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinaExpendedora;

/**
 * La clase Main contiene un método main y varios métodos auxiliares que
 * interactúan con la clase MaquinaExpendedoraGonzalezOlivaAntonio2223 para la
 * venta de snacks.
 */
public class Main {

    /**
     * El método main es el punto de entrada de la aplicación. Crea una
     * instancia de MaquinaExpendedoraGonzalezOlivaAntonio2223 y llama a varios
     * métodos auxiliares para interactuar con ella.
     *
     * @param args Argumentos de comando.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MaquinaExpendedoraGonzalezOlivaAntonio2223 snack;

        snack = new MaquinaExpendedoraGonzalezOlivaAntonio2223(13, 2, 5);
        sube1_PrecioGonzalezOlivaAntonio2223(snack);

        sube2_PrecioGonzalezOlivaAntonio2223(snack);

        obtener1_UnidadesGonzalezOlivaAntonio2223(snack);

        obtener2_UnidadesGOnzalezOlivaAntonio2223(snack);

        obtener3_UnidadesGonzalezOlivaAntonio2223(snack);

    }

    /**
     * Método para intentar sacar 2 unidades de snacks de la máquina con un pago
     * de 5 €. Como no hay suficiente dinero, se produce una excepción y se
     * muestra un mensaje de error.
     *
     * @param snack Objeto de la clase
     * MaquinaExpendedoraGonzalezOlivaAntonio2223 con la que interactuar.
     */
    private static void obtener3_UnidadesGonzalezOlivaAntonio2223(MaquinaExpendedoraGonzalezOlivaAntonio2223 snack) {
        /*Vamos a intentar sacar 12 snack, y tengo 50 euros.
        Como no hay unidades suficientes en la máquina saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("3º.- Vamos a sacar snacks (queremos 12 y tenemos 50 €)");
            snack.sacarsnack(12, 50, "pegatina");
            System.out.println("Operación realizada, ahora tiene " + snack.obtenerUnidades() + " unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes unidades");
            System.out.println("El nº de unidades sigue siendo: " + snack.obtenerUnidades());

        }
    }

    /**
     * Método para intentar sacar 2 unidades de snacks de la máquina con un pago
     * de 9 €. Como no hay suficiente dinero, se produce una excepción y se
     * muestra un mensaje de error.
     *
     * @param snack Objeto de la clase
     * MaquinaExpendedoraGonzalezOlivaAntonio2223 con la que interactuar.
     */
    private static void obtener2_UnidadesGOnzalezOlivaAntonio2223(MaquinaExpendedoraGonzalezOlivaAntonio2223 snack) {
        /*Vamos a intentar sacar 2 snack, y tengo 9 euros.
        Ahora se actualizará el número de snack que tenemos en
        la máquina*/
        try {
            System.out.println("2º.- Vamos a sacar snacks (queremos 2 y tenemos 9 €)");
            snack.sacarsnack(2, 9, "pegatina");
            System.out.println("Operación realizada, ahora tiene " + snack.obtenerUnidades() + " unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes dinero");
            System.out.println("El nº de unidades sigue siendo: " + snack.obtenerUnidades());

        }
    }

    /**
     * Método para intentar sacar 2 unidades de snacks de la máquina con un pago
     * de 5 €. Como no hay suficiente dinero, se produce una excepción y se
     * muestra un mensaje de error.
     *
     * @param snack Objeto de la clase
     * MaquinaExpendedoraGonzalezOlivaAntonio2223 con la que interactuar.
     */
    private static void obtener1_UnidadesGonzalezOlivaAntonio2223(MaquinaExpendedoraGonzalezOlivaAntonio2223 snack) {
        /*Vamos a intentar sacar 2 snack, y tengo 5 euros.
        Como no hay dinero suficiente saltará
        una excepción y no se modificará el nº de unidades de la tienda*/
        try {
            System.out.println("1º.- Vamos a sacar snacks (queremos 2 y tenemos 5 €)");
            snack.sacarsnack(2, 5, "pegatina");
            System.out.println("Operación realizada, ahora tiene " + snack.obtenerUnidades() + " unidades en la máquina");
        } catch (Exception e) {
            System.out.println("Error al sacar snack,porque no hay suficientes dinero");
            System.out.println("El nº de unidades sigue siendo: " + snack.obtenerUnidades());

        }
    }

    /**
     * Método para aumentar el precio de venta de un snack en 3 €. Como esto
     * supera el precio máximo establecido, se produce una excepción y se
     * muestra un mensaje de error.
     *
     * @param snack Objeto de la clase
     * MaquinaExpendedoraGonzalezOlivaAntonio2223 con la que interactuar.
     */
    private static void sube2_PrecioGonzalezOlivaAntonio2223(MaquinaExpendedoraGonzalezOlivaAntonio2223 snack) {
        /*Vamos a aumentar el precio 3€, como supera el precio máximo establecido la operación
        no tendrá éxito y se mantendrá el precio anterior*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por encima del precio máximo");
            snack.aumentarPrecio(3);
            System.out.println("El precio actual es " + snack.obtenerPrecio() + " €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio porque se supera el precio máximo de 5 €");
        }
    }

    /**
     * Aumenta el precio de venta de un snack en 1 €. Como esto no supera el
     * precio máximo establecido, se actualiza el precio y se muestra un
     * mensaje.
     *
     * @param snack Objeto de la clase
     * MaquinaExpendedoraGonzalezOlivaAntonio2223 con la que interactuar.
     */
    private static void sube1_PrecioGonzalezOlivaAntonio2223(MaquinaExpendedoraGonzalezOlivaAntonio2223 snack) {
        /*Vamos a aumentar el precio 1€, como no supera el precio máximo establecido la operación
        tendrá éxito y el nuevo precio será de 3€*/
        try {
            System.out.println("Vamos a aumentar el precio de venta de un snack por debajos del precio máximo");
            snack.aumentarPrecio(1);
            System.out.println("El precio actual es " + snack.obtenerPrecio() + " €");
        } catch (Exception e) {
            System.out.println("Error al aumentar el precio");

        }
    }

}
