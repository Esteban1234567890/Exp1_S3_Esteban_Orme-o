package com.example.demo;

import java.util.List;
import java.util.Map;

public class Student {
    private int id;
    private String name;
    private int age;
    private List<Asignatura> asignaturas;
    private Map<String, List<Double>> notasPorAsignatura;
    private String comentario;

    public Student(int id, String name, int age, List<Asignatura> asignaturas,
           Map<String, List<Double>> notasPorAsignatura, String comentario) {

        this.id = id;
        this.name = name;
        this.age = age;
        this.asignaturas = asignaturas;
        this.notasPorAsignatura = notasPorAsignatura;
        this.comentario = comentario;
    }

    //Getters @
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Asignatura> getAsignaturas(){
        return asignaturas;
    }
    
    public Map<String, List<Double>> getNotasPorAsignatura(){
        return notasPorAsignatura;
    }

    public String getComentarios() {
        return comentario;
    }

}
