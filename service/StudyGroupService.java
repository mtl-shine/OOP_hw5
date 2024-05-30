package service;

import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupService {

    public StudyGroup create(Teacher teacher, List<Student> studentList) {
        return new StudyGroup(teacher, studentList);
    }

}
