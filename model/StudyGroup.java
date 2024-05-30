package model;

import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<User> {

    private Teacher teacher;
    private List<Student> studentList;
    StudyGroup studyGroup;

    public StudyGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "StudyGroup [teacher=" + teacher + ", studentList=" + studentList + "]";
    }

    @Override
    public Iterator<User> iterator() {
        return new StudyGroupIterator(teacher, studentList);
    }

}
