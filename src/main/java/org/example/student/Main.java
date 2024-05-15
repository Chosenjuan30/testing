package org.example.student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String filePath = "/Users/mac/Desktop/student-data-seeding1 - student-data-seeding1.csv.csv";
        List<StudentModel> students = new ArrayList<>();
        StudentService.readFile(students, filePath);
        StudentService.writeFile(students);

    }
}
