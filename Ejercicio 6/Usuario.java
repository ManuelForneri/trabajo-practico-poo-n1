/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unsada.diplomatura.ejercicio6.poo;

import java.util.Scanner;

/**
 *
 * @author manue
 */
public class Usuario {
     String nombre;

    public Usuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        nombre = scanner.nextLine();
    }
    public void saludar() {
        System.out.println("Bienvenido, " + nombre + "!");
    }
}
