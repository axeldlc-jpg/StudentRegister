/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentregister;

/**
 * @author
 * Axel de la cruz Tutacano
 * Cristofer Salas Moreno
 * Alexander Gonzales
 */
public class Tarea {
    private int id;
    private String titulo;
    private String curso;
    private String fechaInicio;
    private String fechaFin;
    private boolean completada;

    public Tarea(int id, String titulo, String curso, String fechaInicio, String fechaFin) {
        this.id = id;
        this.titulo = titulo;
        this.curso = curso;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.completada = false;
    }

    public int getId() { return id; }
    public String getTitulo() { return titulo; }
    public String getCurso() { return curso; }
    public String getFechaInicio() { return fechaInicio; }
    public String getFechaFin() { return fechaFin; }
    public boolean isCompletada() { return completada; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setCurso(String curso) { this.curso = curso; }
    public void setFechaInicio(String fechaInicio) { this.fechaInicio = fechaInicio; }
    public void setFechaFin(String fechaFin) { this.fechaFin = fechaFin; }
    public void setCompletada(boolean completada) { this.completada = completada; }
}

