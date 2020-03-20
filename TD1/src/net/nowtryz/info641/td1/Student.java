package net.nowtryz.info641.td1;

import java.util.*;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private String surname;
    private long id;
    private String promotion;
    private List<Module> modules = new LinkedList<>();

    public Student(String name, String surname, long id, String promotion) {
        this.name = name;
        this.surname = surname;
        this.id = id;
        this.promotion = promotion;
    }

    public Student(String name, String surname, long id, String promotion, Module[] modules) {
        this(name, surname, id, promotion);
        Collections.addAll(this.modules, modules);
    }

    public int nbHeuuresASuivre() {
        return modules
                .stream()
                .mapToInt(Module::nbHeuresEtudiant)
                .sum();
    }

    public void addModule(Module module) {
        modules.add(module);
    }

    public void removeModule(Module module) {
        modules.remove(module);
    }

    @Override
    public String toString() {
        final String courses = modules
                .stream()
                .map(Objects::toString)
                .collect(Collectors.joining(" "));
        return surname + ' ' + name + " (" + id + "), étudiant en " + promotion + ", est inscrit en " + courses;
    }
}
