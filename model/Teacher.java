package model;

public class Teacher extends User{
    private int teacherId;

    public Teacher(int teacherId, String secondName, String firstName, String lastName, String birthDate) {
        super(secondName, firstName, lastName, birthDate);
        this.teacherId = teacherId;
    }

    public int getTeacherId() {
        return teacherId;
    }

    @Override
    public String toString() {
        return "Teacher [teacherId=" + teacherId + "]" + " " + super.toString();
    }
}
