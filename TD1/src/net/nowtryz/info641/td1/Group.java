package net.nowtryz.info641.td1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Group {
    private List<Student> students = new ArrayList<>();
    private String name;

    public Group(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
    }

    @Override
    public String toString() {
        final String list = this.students.stream().map(Objects::toString).collect(Collectors.joining("\n\t"));
        return "Le groupe de TD " + name + " est composé des étudiant suivants : \n\t" + list;
    }
}
