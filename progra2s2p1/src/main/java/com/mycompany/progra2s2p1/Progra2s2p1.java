/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progra2s2p1;

/**
 *
 * @author cpere
 */
public class Progra2s2p1 {

    public static void main(String[] args) {
        // Crear catedráticos
        Catedratico catedratico1 = new Catedratico("Dr. Juan Pérez", "Calle 123", "555-1234", "Matemáticas");
        Catedratico catedratico2 = new Catedratico("Dra. Ana Gómez", "Avenida 456", "555-5678", "Física");
        Catedratico catedratico3 = new Catedratico("Dr. Luis Martínez", "Boulevard 789", "555-9012", "Química");

        // Crear cursos
        Curso curso1 = new Curso(1, "Álgebra", 2, 3, catedratico1);
        Curso curso2 = new Curso(2, "Física", 5, 4, catedratico2);
        Curso curso3 = new Curso(3, "Química", 5, 4, catedratico3);

        // Crear alumnos
        Alumno alumno1 = new Alumno("Carlos López", "mixco zona1", "12345678", 20);
        Alumno alumno2 = new Alumno("María Rodríguez", "guatemala zona 4", "87654321", 21);
        Alumno alumno3 = new Alumno("José Hernández", "villa nueva zona 9", "45696371", 22);

        // Asignar cursos a los alumnos
        Asignacion asignacion1 = new Asignacion(alumno1);
        asignacion1.addCurso(curso1);
        asignacion1.addCurso(curso2);
        asignacion1.addCurso(curso3);

        Asignacion asignacion2 = new Asignacion(alumno2);
        asignacion2.addCurso(curso1);
        asignacion2.addCurso(curso2);
        asignacion2.addCurso(curso3);

        Asignacion asignacion3 = new Asignacion(alumno3);
        asignacion3.addCurso(curso1);
        asignacion3.addCurso(curso2);
        asignacion3.addCurso(curso3);

        // Imprimir datos
        catedratico1.imprimirDatos();
        catedratico2.imprimirDatos();
        catedratico3.imprimirDatos();

        alumno1.imprimirDatos();
        alumno2.imprimirDatos();
        alumno3.imprimirDatos();
    }
}
