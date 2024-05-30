package model;

public class Student extends User {
    private int studentId;

    public Student(int studentId, String secondName, String firstName, String lastName, String birthDate) {
        super(secondName, firstName, lastName, birthDate);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Student [studentId=" + studentId + "]" + " " + super.toString();
    }


}
