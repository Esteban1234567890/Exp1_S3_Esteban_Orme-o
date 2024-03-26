package com.example.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

@RestController
public class StudentController {
    private List<Student> students = new ArrayList<>();

    public StudentController() {

        students.add(new Student(1, "Kogeki", 22,
                Arrays.asList(new Asignatura("MAT", "matematicas"), new Asignatura("LEN", "lenguaje")),
                llenarListaNotas("matematicas", 5.0), "Las clases de matematicas son excelentes y con los profesores resolviendo dudas"));

        students.add(new Student(2, "xMatii", 23,
                Arrays.asList(new Asignatura("MAT", "matematicas"), new Asignatura("MAT", "matematicas")),
                llenarListaNotas("matematicas", 3.5),"Me parece bueno las clases de matematicas"));

        students.add(new Student(2, "Daknesskills", 25,
                Arrays.asList(new Asignatura("MAT", "matematicas"), new Asignatura("MAT", "matematicas")),
                llenarListaNotas("matematicas", 5.0), "Muy bueno"));

        students.add(new Student(2, "Grotth", 27,
                Arrays.asList(new Asignatura("MAT", "matematicas"), new Asignatura("MAT", "matematicas")),
                llenarListaNotas("matematicas", 1.0),"No entendi mucho y cuando queria resolver dudas no me explicaban"));

    }

    private Map<String, List<Double>> llenarListaNotas(String asignatura, Double nota1) {

        Map<String, List<Double>> retorno = new HashMap<String, List<Double>>();

        List<Double> notas = Arrays.asList(nota1);

        retorno.put(asignatura, notas);

        return retorno;
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return students;
    }

    @GetMapping("/studentsPromedio")
    public Double getTotalPromedio() {
        Double totalPromedio = 0.0; 
        int count = 0; 
        for (Student estudiante : students) {
            Map<String, List<Double>> notasPorAsignatura = estudiante.getNotasPorAsignatura();
            if (notasPorAsignatura != null && !notasPorAsignatura.isEmpty()) {
                for (List<Double> notas : notasPorAsignatura.values()) {
                    for (Double nota : notas) {
                        totalPromedio += nota;
                        count++;
                    }
                }
            }
        }
        if (count > 0) {
            totalPromedio /= count; 
        }
        return totalPromedio;
    }

    @GetMapping("/students/{id}")
    public Student getStudentById(@PathVariable int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }

}
