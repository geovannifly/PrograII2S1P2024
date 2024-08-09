/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra2s2p1;

/**
 *
 * @author cpere
 */
public class Catedratico {
    
    private static int contador = 0;
    private int codigoCatedratico;
    private String nombre;
    private String direccion;
    private String telefono;
    private String profesion;

    /**
     * Constructor de la clase Catedratico.
     * @param nombre Nombre del catedrático.
     * @param direccion Dirección del catedrático.
     * @param telefono Teléfono del catedrático.
     * @param profesion Profesión del catedrático.
     */
    public Catedratico(String nombre, String direccion, String telefono, String profesion) {
        this.codigoCatedratico = ++contador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.profesion = profesion;
    }

    /**
     * Imprime los datos del catedrático.
     */
    public void imprimirDatos() {
        System.out.println("-------------- Datos de Catedratico --------------\n" +
               "Código: " + codigoCatedratico + "\n" +
               "Nombre: " + nombre + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Profesión: " + profesion + "\n" +
               "--------------------------------------------------");
    }
    
}
