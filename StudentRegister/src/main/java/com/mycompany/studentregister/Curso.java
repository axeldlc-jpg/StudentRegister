package com.mycompany.studentregister;

/**
 * @author
 * Axel de la cruz Tutacano
 * Cristofer Salas Moreno
 * Alexander Gonzales
 */
public class Curso { 
    private int id; //Identificador único del curso
    private String nombre; //Nombre del curso (por ejemplo: "Matemática")
//Iniciamos el constructor
    public Curso(int id, String nombre) {
        //Asignamos el valor recibido al atributo id del objeto
        this.id = id; 
        //Asignamos el valor recibido al atributo nombre del objeto
        this.nombre = nombre;
    }
//creamos un método 
    public int getId() { return id; }
    //Retorna el id del curso
    public String getNombre() { return nombre; }
    //Retorna el nombre del curso

    public void setId(int id) { 
        this.id = id;               //Modifica el atributo id
    } 
    public void setNombre(String nombre) { this.nombre = nombre; } //Modifica el atributo nombre
//Usamos el método ToString para mostrar el nombre del curso cuando se imprime el objeto
    @Override
    public String toString() {
        return nombre;          //Retorna solo el nombre del curso como representación del objeto
    }
}
