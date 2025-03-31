package org.example;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Inscripcion {
    private Set<Materia> materiasParaAnotarAlumno;
    private Alumno alumno;

    public Inscripcion(Alumno alumno) {
        this.alumno = alumno;
        this.materiasParaAnotarAlumno = new HashSet<>();
    }

    public void agregarMateriasACursar(Materia ... nuevaMateriaACursar){
        Collections.addAll(this.materiasParaAnotarAlumno,nuevaMateriaACursar);
    }

    public boolean aprobada(){

        return this.materiasParaAnotarAlumno.stream()
                .allMatch(
                unaMateria -> unaMateria.cumpleCorrelativas(this.alumno.getMateriasAprobadas()));
    }

}
