
package com.mycompany.studentregister;
import java.util.ArrayList;

/**
 * @author
 * Axel de la cruz Tutacano
 * Cristofer Salas Moreno
 * Alexander Gonzales
 */
public class GestorTareas {
    
    private ArrayList<Tarea> listaTareas;

    public GestorTareas() {
        listaTareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea t) {
        listaTareas.add(t);
    }

    public void eliminarTarea(int id) {
        listaTareas.removeIf(t -> t.getId() == id);
    }

    public void editarTarea(Tarea nuevaTarea) {
        for (int i = 0; i < listaTareas.size(); i++) {
            if (listaTareas.get(i).getId() == nuevaTarea.getId()) {
                listaTareas.set(i, nuevaTarea);
                break;
            }
        }
    }

    public Tarea buscarTarea(int id) {
        for (Tarea t : listaTareas) {
            if (t.getId() == id) return t;
        }
        return null;
    }

    public ArrayList<Tarea> obtenerTareasPorCurso(String curso) {
        ArrayList<Tarea> resultado = new ArrayList<>();
        for (Tarea t : listaTareas) {
            if (t.getCurso().equalsIgnoreCase(curso)) {
                resultado.add(t);
            }
        }
        return resultado;
    }

    public void marcarTareaComoHecha(int tareaId, Estudiante est) {
        est.getTareasCompletadas().add(tareaId);
        Tarea t = buscarTarea(tareaId);
        if (t != null) t.setCompletada(true);
    }

    public ArrayList<Tarea> getListaTareas() {
        return listaTareas;
    }
}
