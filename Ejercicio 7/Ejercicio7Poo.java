/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unsada.diplomatura.ejercicio7.poo;

/**
 *
 * @author manue
 */
public class Ejercicio7Poo {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("Manuel", 1000.0);
        
        cuenta.retirar(300.0);
        cuenta.retirar(500.0);
        cuenta.retirar(300.0); 
    }
}
