/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentregister;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author
 * Axel de la cruz Tutacano
 * Cristofer Salas Moreno
 * Alexander Gonzales
 */
public class Main {
    private static GestorTareas gestor = new GestorTareas();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== SISTEMA DE TAREAS ===");
            System.out.println("1. Docente");
            System.out.println("2. Estudiante");
            System.out.println("3. Salir");
            System.out.print("Elige una opcion: ");
            int op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1: menuDocente(); break;
                case 2: menuEstudiante(); break;
                case 3: System.exit(0);
                default: System.out.println("Opcion invalida.");
            }
        }
    }

    private static void menuDocente() {
        System.out.println("\n== MODO DOCENTE ==");
        System.out.print("Cursos disponibles: Matematica, Historia, Comunicacion\n");
        System.out.print("Ingrese el nombre del curso: ");
        String curso = sc.nextLine();

        while (true) {
            System.out.println("\n1. Crear tarea");
            System.out.println("2. Ver tareas");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Volver al menú principal");
            System.out.print("Opción: ");
            int op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Titulo: ");
                    String titulo = sc.nextLine();
                    System.out.print("Fecha inicio (YYYY-MM-DD): ");
                    String fi = sc.nextLine();
                    System.out.print("Fecha fin (YYYY-MM-DD): ");
                    String ff = sc.nextLine();
                    int id = gestor.getListaTareas().size() + 1;
                    gestor.agregarTarea(new Tarea(id, titulo, curso, fi, ff));
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    ArrayList<Tarea> tareas = gestor.obtenerTareasPorCurso(curso);
                    if (tareas.isEmpty()) System.out.println("No hay tareas.");
                    for (Tarea t : tareas) {
                        System.out.println("ID: " + t.getId() + " | " + t.getTitulo() + " | " + t.getFechaInicio() + " - " + t.getFechaFin());
                    }
                    break;
                case 3:
                    System.out.print("ID de tarea a eliminar: ");
                    int idEliminar = sc.nextInt(); sc.nextLine();
                    gestor.eliminarTarea(idEliminar);
                    System.out.println("Tarea eliminada.");
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Opcion invalida.");
            }
        }
    }

    private static void menuEstudiante() {
        System.out.println("\n== MODO ESTUDIANTE ==");
        System.out.print("Nombre del estudiante: ");
        String nombre = sc.nextLine();
        System.out.print("Curso: ");
        String curso = sc.nextLine();

        Estudiante estudiante = new Estudiante(1, nombre, curso);

        while (true) {
            System.out.println("\n1. Ver tareas");
            System.out.println("2. Marcar tarea como hecha");
            System.out.println("3. Volver al menu principal");
            System.out.print("Opcion: ");
            int op = sc.nextInt(); sc.nextLine();

            switch (op) {
                case 1 -> {
                    ArrayList<Tarea> tareas = gestor.obtenerTareasPorCurso(curso);
                    if (tareas.isEmpty()) {
                        System.out.println("No hay tareas.");
                        break;
                    }
                    for (Tarea t : tareas) {
                        String estado = estudiante.getTareasCompletadas().contains(t.getId()) ? "✅ Hecha" : "❌ Pendiente";
                        System.out.println("ID: " + t.getId() + " | " + t.getTitulo() + " | " + estado);
                    }
                }
                case 2 -> {
                    System.out.print("ID de la tarea a marcar como hecha: ");
                    int id = sc.nextInt(); sc.nextLine();
                    gestor.marcarTareaComoHecha(id, estudiante);
                    System.out.println("✅ Marcada como hecha.");
                }
                case 3 -> {
                    return;
                }
                default -> System.out.println("Opcion invalida.");
            }
        }
    }
}
