/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra2s2p1;

/**
 *
 * @author cpere
 */
public class Alumno {
 private static int contador = 0;
    private int carnet;
    private String nombre;
    private String direccion;
    private String telefono;
    private int edad;

    /**
     * Constructor de la clase Alumno.
     * @param nombre Nombre del alumno.
     * @param direccion Dirección del alumno.
     * @param telefono Teléfono del alumno.
     * @param edad Edad del alumno.
     */
    public Alumno(String nombre, String direccion, String telefono, int edad) {
        this.carnet = ++contador;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.edad = edad;
    }

    /**
     * Imprime los datos del alumno.
     */
    public void imprimirDatos() {
        System.out.println("----------------- Datos de Alumno ----------------\n" +
               "Carnet: " + carnet + "\n" +
               "Nombre: " + nombre + "\n" +
               "Dirección: " + direccion + "\n" +
               "Teléfono: " + telefono + "\n" +
               "Edad: " + edad + "\n" +
               "--------------------------------------------------");    
    }
}
