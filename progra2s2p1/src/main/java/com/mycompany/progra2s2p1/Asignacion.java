/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progra2s2p1;

/**
 *
 * @author cpere
 */
public class Asignacion {
    private Alumno alumno;
    private Curso[] cursos;

    /**
     * Constructor de la clase Asignacion.
     *
     * @param alumno Alumno al que se le asignarán los cursos.
     */
    public Asignacion(Alumno alumno) {
        this.alumno = alumno;
        this.cursos = new Curso[10]; // Asumiendo un máximo de 10 cursos por alumno
    }

    /**
     * Agrega un curso a la asignación del alumno.
     *
     * @param curso Curso a agregar.
     */
    public void addCurso(Curso curso) {
        if (curso.verificaEspacio()) {
            for (int i = 0; i < cursos.length; i++) {
                if (cursos[i] == null) {
                    cursos[i] = curso;
                    curso.setAlumnosAsignados(curso.getAlumnosAsignados() + 1);
                    break;
                }
            }
        } else {
            System.out.println("No hay espacio en el curso: " + curso.getTitulo());
        }
    }
}
