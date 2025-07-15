
package com.mycompany.studentregister;
import java.util.ArrayList;

/**
 * @author
 * Axel de la cruz Tutacano
 * Cristofer Salas Moreno
 * Alexander Gonzales
 */
public class Estudiante {
    private int id;
    private String nombre;
    private String curso;
    private ArrayList<Integer> tareasCompletadas;

    public Estudiante(int id, String nombre, String curso) {
        this.id = id;
        this.nombre = nombre;
        this.curso = curso;
        this.tareasCompletadas = new ArrayList<>();
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCurso() { return curso; }
    public ArrayList<Integer> getTareasCompletadas() { return tareasCompletadas; }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setCurso(String curso) { this.curso = curso; }
}
