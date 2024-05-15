package org.example.teacher;

import java.io.*;
import java.util.List;

public class TeacherService {
    public static void readTeacherFile(List<TeacherModel> teachers, String filePath){
        try{
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null){
                String[] fields = line.split(",",-1);
                for(int i = 0; i < fields.length; i++){
                    if(fields[i].isEmpty()){
                        fields[i] = "null";
                    }

                }
                TeacherModel teacher = new TeacherModel(fields[0],fields[1],fields[2],fields[3]);
                teachers.add(teacher);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for(TeacherModel teacher : teachers){
            System.out.println(teacher);
        }
    }

    public static void writeTeacherFile (List<TeacherModel>teachers){

        String destinationPath = System.getProperty("user.home") + "/IdeaProjects/Week_4/src/main/resources/teachers/";
        try{
            FileWriter fw = new FileWriter(destinationPath + "teacher_out_data.csv");
            for(TeacherModel teacher : teachers){
                fw.write(teacher.getTeacherId() + ",");
                fw.write(teacher.getEmail() + ",");
                fw.write(teacher.getFirstName() + ",");
                fw.write(teacher.getLastName() + ",");

            }
            fw.close();
            System.out.println("Teachers file written successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

