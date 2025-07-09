/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unsada.diplomatura.ejercicio7.poo;

/**
 *
 * @author manue
 */
public class CuentaBancaria {
     String titular;
    double saldo;
    
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso de $" + monto);
        } else {
            System.out.println("No es posible retirar $" + monto + ": saldo insuficiente.");
        }
        System.out.println("Saldo actual: $" + saldo);
    }
}
