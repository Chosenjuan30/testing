package org.example.teacher;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String filePath = "//Users/mac/Downloads/teacher-data.csv.csv";
        List<TeacherModel> teachers  = new ArrayList<>();
        TeacherService.readTeacherFile(teachers, filePath);
        TeacherService.readTeacherFile(teachers, filePath);
        TeacherService.writeTeacherFile(teachers);
    }
}
