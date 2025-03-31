package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Alumno {
    private String nombre;
    private String apellido;
    private Set<Materia> materiasAprobadas;

    public Alumno(String nombre,String apellido) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.materiasAprobadas = new HashSet<>();
    }

    public void agregarMateriasAprobadas(Materia ... nuevaMateria){
        Collections.addAll(this.materiasAprobadas,nuevaMateria);
    }

    public Set<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
