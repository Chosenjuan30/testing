package org.example.student;

import java.io.*;
import java.util.List;

public class StudentService {
    public static void readFile(List<StudentModel> students, String filePath) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",", -1);
                for (int i = 0; i < values.length; i++) {
                    if(values[i].isEmpty()){
                        values[i] = "null";
                    }
                }
                StudentModel student = new StudentModel(values[0],values[1],values[2],values[3],values[4],values[5],values[6],values[7],values[8]);
                students.add(student);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(StudentModel student : students){
            System.out.println(student);
        }

    }

    public static void writeFile(List<StudentModel>students){

        String destinationPath = System.getProperty("user.home") + "/IdeaProjects/Week_4/src/main/resources/student/";
        try{
            FileWriter fw = new FileWriter(destinationPath + "student_output1.csv");
            for(StudentModel student : students){
                fw.write(student.getStudentId() + ",");
                fw.write(student.getFirstname() + ",");
                fw.write(student.getLastName() + ",");
                fw.write(student.getGradelevel() + ",");
                fw.write(student.getEmail() + ",");
                fw.write(student.getGuardianEmail1() + ",");
                fw.write(student.getGuardianEmail2() + ",");
                fw.write(student.getIsAchieved() + ",");
                fw.write(student.getIsDeleted() + "\n");
            }
            fw.close();
            System.out.println("Successfully written to a new csv file: !!!");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

