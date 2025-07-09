/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unsada.diplomatura.ejercicio4.poo;

/**
 *
 * @author manue
 */
public class Numero {
    int valor;

    
    public Numero(int valor) {
        this.valor = valor;
    }
    
    public boolean es_par() {
        return valor % 2 == 0;
    }
}
