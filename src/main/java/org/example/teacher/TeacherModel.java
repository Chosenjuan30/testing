package org.example.teacher;

public class TeacherModel {
    private String teacherId;
    private String email;
    private String firstName;
    private String lastName;

    public TeacherModel(String teacherId, String email, String firstName, String lastName) {
        this.teacherId = teacherId;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return
                teacherId + '\'' +" " +
                email + '\'' + " " +
                firstName + '\'' +" " +
                 lastName + '\'' +" " +
                '}';
    }
}
