/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package unsada.diplomatura.ejercicio4.poo;

/**
 *
 * @author manue
 */
public class Ejercicio4Poo {

    public static void main(String[] args) {
        Numero n1 = new Numero(4);
        Numero n2 = new Numero(7);
        Numero n3 = new Numero(5);
        Numero n4 = new Numero(-2);
        
        System.out.println( n1.es_par());
        System.out.println(n2.es_par());
        System.out.println(n3.es_par());
        System.out.println(n4.es_par());
    }
}
