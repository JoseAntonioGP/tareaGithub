package cuentas;

/**
 * Simula una cuenta bancaria
 * 
 * @author jose
 * @version 1.0
 * @since 30-01-2022
 */
public class Main {

    /**
     * Método main
     * Realiza los cálculos en una cuenta bancaria tras retirar e ingresar unas cantidades
     * 
     * @param args 
     */
    public static void main(String[] args) {
        operativa_cuenta(0);
    }
/**
 * Calcula el saldo de la cuenta tras ingresar y retirar unas cantidades
 * 
 * @param cantidad el saldo de la cuenta
 */
    private static void operativa_cuenta(float cantidad) {
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
}
