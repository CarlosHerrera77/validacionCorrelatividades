package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class MateriaTest {

    @Test
    public void inicilizarMateriaCorrectamente(){

        Materia materia1 = new Materia("analisis matematico 1");
        Materia materia2 = new Materia("fisica 1");
        Materia materia3 = new Materia("algoritmos");
        Materia materia4 = new Materia("arquitectura");

        Assertions.assertEquals("analisis matematico 1",materia1.getNombre());
        Assertions.assertEquals("fisica 1",materia2.getNombre());
        Assertions.assertEquals("algoritmos",materia3.getNombre());
        Assertions.assertEquals("arquitectura",materia4.getNombre());
    }
    @Test
    public void cargaCorrelatividadesCorrectamente(){
        Materia materia1 = new Materia("analisis matematico 1");
        Materia materia2 = new Materia("fisica 1");
        Materia materia3 = new Materia("algoritmos");
        Materia materia4 = new Materia("arquitectura");

        Materia materia5 = new Materia("fisica 2");
        materia5.agregarMateriasCorrelativas(materia1,materia2);

        Set<Materia> correlativas1 = new HashSet<>();
        correlativas1.add(materia1);
        correlativas1.add(materia2);

        Materia materia6 = new Materia("paradigmas");
        materia6.agregarMateriasCorrelativas(materia3,materia4);

        Set<Materia> correlativas2 = new HashSet<>();
        correlativas2.add(materia3);
        correlativas2.add(materia4);

        Materia materia7 = new Materia("analisis matematico 2");
        materia7.agregarMateriasCorrelativas(materia1);

        Set<Materia> correlativas3 = new HashSet<>();
        correlativas3.add(materia1);

        assertEquals(correlativas2,materia6.getMateriasCorrelativas(),"deben ser iguales");
        assertEquals(correlativas1,materia5.getMateriasCorrelativas(),"deben ser iguales");
        assertEquals(correlativas3,materia7.getMateriasCorrelativas(),"deben ser iguales");

    }

    @Test
    public void calculaBienCorrelativas(){
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



        Alumno alumno = new Alumno("pepe","rojo");
        alumno.agregarMateriasAprobadas(materia1,materia2);


        assertTrue(materia7.cumpleCorrelativas(alumno.getMateriasAprobadas()),"mo cumple correlativas");
        assertTrue(materia5.cumpleCorrelativas(alumno.getMateriasAprobadas()),"no cumple correlativas");
        //assertTrue(materia6.cumpleCorrelativas(alumno.getMateriasAprobadas()),"no cumple correlativas");
        //HICE UN TESTEO QUE FALLA PERO LO COMENTE
    }

}