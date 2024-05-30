package model;

import java.util.Iterator;
import java.util.List;

public class StudyGroupIterator implements Iterator<User> {
    private Teacher teacher;
    private List<Student> studentList;
    private int counter1;
    private int counter2;

    public StudyGroupIterator(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
    }

    @Override
    public boolean hasNext() {
        return counter2 < studentList.size();
    }

    @Override
    public User next() {
        if (hasNext()) {
            if (counter1 == 0) {
                counter1++;
                return teacher;
            } else {
                return studentList.get(counter2++);
            }
        }
        return null;
    }

}
