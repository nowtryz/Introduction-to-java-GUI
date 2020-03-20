package net.nowtryz.info641.td1;

public class JeuDeTests1 {
    public static void main(String[] args) {
        System.out.println(Long.MAX_VALUE);
        final Module module = new Module("Info", 541, 10,10,10);
        final Student damien = new Student("Djomby", "Damien", 51906147, "FI3-IDU");
        final Group group = new Group("TD1");
        damien.addModule(module);
        group.addStudent(damien);
        System.out.println(group);
    }
}
