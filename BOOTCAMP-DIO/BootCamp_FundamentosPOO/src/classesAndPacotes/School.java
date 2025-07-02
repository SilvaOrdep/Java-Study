package classesAndPacotes;

import classesAndPacotes.model.Student;

public class School {
    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Gleysom";
        student1.age = 37;
        student1.presentation(student1.name, student1.age);
    }
}
