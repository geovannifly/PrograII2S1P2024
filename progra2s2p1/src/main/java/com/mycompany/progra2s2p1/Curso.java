/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra2s2p1;

/**
 *
 * @author cpere
 */
public class Curso {
    private int id;
    private String titulo;
    private int numMaxAlumnos;
    private int creditos;
    private Catedratico catedratico;
    private int alumnosAsignados;

    /**
     * Constructor de la clase Curso.
     *
     * @param id Identificador del curso.
     * @param titulo Título del curso.
     * @param numMaxAlumnos Número máximo de alumnos.
     * @param creditos Créditos del curso.
     * @param catedratico Catedrático asignado al curso.
     */
    public Curso(int id, String titulo, int numMaxAlumnos, int creditos, Catedratico catedratico) {
        this.id = id;
        this.titulo = titulo;
        this.numMaxAlumnos = numMaxAlumnos;
        this.creditos = creditos;
        this.catedratico = catedratico;
        this.alumnosAsignados = 0;
    }

    // Métodos set y get para cada atributo
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumMaxAlumnos() {
        return numMaxAlumnos;
    }

    public void setNumMaxAlumnos(int numMaxAlumnos) {
        this.numMaxAlumnos = numMaxAlumnos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Catedratico getCatedratico() {
        return catedratico;
    }

    public void setCatedratico(Catedratico catedratico) {
        this.catedratico = catedratico;
    }

    public int getAlumnosAsignados() {
        return alumnosAsignados;
    }

    public void setAlumnosAsignados(int alumnosAsignados) {
        this.alumnosAsignados = alumnosAsignados;
    }

    /**
     * Verifica si hay espacio en el curso.
     *
     * @return true si hay espacio, false en caso contrario.
     */
    public boolean verificaEspacio() {
        return alumnosAsignados < numMaxAlumnos;
    }
}
