package controller;

import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;
import model.Type;
import model.User;
import service.DataService;
import service.StudyGroupService;
import view.StudyGroupView;
import view.StudentView;

public class Controller {
    private StudentView sv = new StudentView();
    private DataService ds = new DataService();
    private StudyGroupView sgv = new StudyGroupView();
    private StudyGroupService sgs = new StudyGroupService();
    private StudyGroup studyGroup;

    public void createStudent(String secondName, String firstName, String lastName, String birthDate) {
        ds.create(secondName, firstName, lastName, birthDate, Type.Student);
    }

    public void printStudentList() {
        for (User user : ds.getAllStudent()) {
            sv.sendOnConsole((Student) user);
        }
    }

    public List<Student> getStudentList() {
        return ds.getAllStudent();
    }

    public void createTeacher(String secondName, String firstName, String lastName, String birthDate) {
        ds.create(secondName, firstName, lastName, birthDate, Type.Teacher);
    }

    public void createStudyGroup(Teacher teacher, List<Student> studentList) {
        studyGroup = sgs.create(teacher, studentList);
    }

    public void printStudyGroup() {
        for (User user : studyGroup) {
            sgv.sendOnConsole(user);
        }
    }

    public void printEveryone() {
        for (User user : ds.getEveryone()) {
            sgv.sendOnConsole(user);
        }
    }

    public Teacher getTeacherById(int id) {
        return ds.getTeacherById(id);
    }

    public void printTeacherList() {
        for (User user : ds.getAllTeacher()) {
            sgv.sendOnConsole(user);
        }
    }

}
