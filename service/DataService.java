package service;

import java.util.ArrayList;
import java.util.List;
import model.User;
import model.Type;
import model.Student;
import model.Teacher;

public class DataService {
    private List<User> userList = new ArrayList<>();

    public List<User> getUserList() {
        return userList;
    }

    public void create(String secondName, String firstName, String lastName, String birthDate, Type type) {
        int id = getId(type);
        if (Type.Student == type) {
            Student student = new Student(id, secondName, firstName, lastName, birthDate);
            userList.add(student);
        } else if (Type.Teacher == type) {
            Teacher teacher = new Teacher(id, secondName, firstName, lastName, birthDate);
            userList.add(teacher);
        }
    }

    private int getId(Type type) {
        int id = 0;
        for (User user : userList) {
            if (user instanceof Teacher && Type.Teacher == type) {
                id = ((Teacher) user).getTeacherId();
            } else if (user instanceof Student && Type.Student == type) {
                id = ((Student) user).getStudentId();
            }
        }
        return ++id;
    }

    public List<Student> getAllStudent() {
        List<Student> studentList = new ArrayList<>();
        for (User user : userList) {
            if (user instanceof Student) {
                studentList.add((Student)user);
            }
        }
        return studentList;
    }

    public List<User> getAllTeacher() {
        List<User> userList = new ArrayList<>();
        for (User user : this.userList) {
            if (user instanceof Teacher) {
                userList.add(user);
            }
        }
        return userList;
    }

    public List<User> getEveryone() {
        List<User> userList = new ArrayList<>();
        for (User user : this.userList) {
            userList.add(user);
        }
        return userList;
    }

    public Teacher getTeacherById(int id) {
        return (Teacher)((getAllTeacher()).get(id-1));
    }

}
