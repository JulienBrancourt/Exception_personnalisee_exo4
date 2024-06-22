package org.example.exceptions.exo4.perso;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int nombreEtudiants;



    private static List<Student> tousLesEtudiants = new ArrayList<>();

    private int id;
    private String name;
    private int age;

    public Student(String name, int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge doit être un entier positif");
        }
        nombreEtudiants++;
        this.id = nombreEtudiants;
        this.name = name;
        this.age = age;
        tousLesEtudiants.add(this);
    }

    public static List<Student> getTousLesEtudiants() {
        return tousLesEtudiants;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("L'âge doit être un entier positif");
        }
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
