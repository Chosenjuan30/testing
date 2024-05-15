package org.example.student;

public class StudentModel {
    private String studentId;
    private String firstname;
    private String lastName;
    private String gradelevel;
    private String email;
    private String guardianEmail1;
    private String guardianEmail2;
    private String isAchieved;
    private String isDeleted;

    public String getStudentId() {
        return studentId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGradelevel() {
        return gradelevel;
    }

    public String getEmail() {
        return email;
    }

    public String getGuardianEmail1() {
        return guardianEmail1;
    }
    public String getGuardianEmail2() {
        return guardianEmail2;
    }

    public String getIsAchieved() {
        return isAchieved;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public StudentModel(String studentId, String firstname,
                        String lastName, String gradelevel,
                        String email, String guardianEmail1, String guardianEmail2,
                        String isAchieved, String isDeleted) {
        this.studentId = studentId;
        this.firstname = firstname;
        this.lastName = lastName;
        this.gradelevel = gradelevel;
        this.email = email;
        this.guardianEmail1 = guardianEmail1;
        this.guardianEmail2 = guardianEmail2;
        this.isAchieved = isAchieved;
        this.isDeleted = isDeleted;



    }

    @Override
    public String toString() {
        return
                studentId + '\'' +
                firstname + '\'' +
                lastName + '\'' +
                gradelevel + '\'' +
                email + '\'' +
                guardianEmail1 + '\'' +
                guardianEmail2 + '\'' +
                isAchieved + '\'' +
                isDeleted + '\'';
    }
}
