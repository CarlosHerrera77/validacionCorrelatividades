package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Materia {
    private String nombre;
    private Set<Materia> materiasCorrelativas;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.materiasCorrelativas = new HashSet<>();
    }

    public void agregarMateriasCorrelativas(Materia ... nuevaCorrelativa){
        Collections.addAll(this.materiasCorrelativas,nuevaCorrelativa);
    }

    public String getNombre() {
        return nombre;
    }

    public Set<Materia> getMateriasCorrelativas() {
        return materiasCorrelativas;
    }

    public boolean cumpleCorrelativas(Set<Materia> materiasAprobadasPorAlumno){
        return materiasAprobadasPorAlumno.containsAll(this.materiasCorrelativas);
    }
}
