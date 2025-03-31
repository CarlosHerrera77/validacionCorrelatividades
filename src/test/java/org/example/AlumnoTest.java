package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AlumnoTest {

    @Test
    public void iniciarCorrectamenteYagregarMateriasAprobadas(){
        Alumno alumno = new Alumno("pepe","rojo");

        Materia materia1 = new Materia("analisis matematico 1");
        Materia materia2 = new Materia("fisica 1");

        alumno.agregarMateriasAprobadas(materia1,materia2);

        Set<Materia> aprobadas = new HashSet<>();
        aprobadas.add(materia1);
        aprobadas.add(materia2);

        Assertions.assertEquals("pepe", alumno.getNombre());
        Assertions.assertEquals("rojo", alumno.getApellido());
        assertEquals(aprobadas,alumno.getMateriasAprobadas(),"deben ser iguales");

    }


}