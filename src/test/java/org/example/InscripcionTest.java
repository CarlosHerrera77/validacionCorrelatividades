package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    public void inicilizarInscripcionYVerSiEstaAprobada(){

        //instancias de materias
        Materia materia1 = new Materia("analisis matematico 1");
        Materia materia2 = new Materia("fisica 1");
        Materia materia3 = new Materia("algoritmos");
        Materia materia4 = new Materia("arquitectura");
        Materia materia5 = new Materia("fisica 2");
        materia5.agregarMateriasCorrelativas(materia1,materia2);
        Materia materia6 = new Materia("paradigmas");
        materia6.agregarMateriasCorrelativas(materia3,materia4);
        Materia materia7 = new Materia("analisis matematico 2");
        materia7.agregarMateriasCorrelativas(materia1);

        //instancia alumno
        Alumno alumno = new Alumno("pepe","rojo");
        alumno.agregarMateriasAprobadas(materia1,materia2);


        Inscripcion inscripcion = new Inscripcion(alumno);
        inscripcion.agregarMateriasACursar(materia7,materia5);

        //si agrego la materia6 rompe porque no cumple correlativas

        assertTrue(inscripcion.aprobada(),"Hay materia que no cumplen correlativas");


    }

}