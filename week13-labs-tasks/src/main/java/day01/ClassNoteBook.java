package day01;

import java.util.*;

public class ClassNoteBook {
    private Map<Student, List<Integer>> studentList = new TreeMap<>();

    public void addStudent(Student student) {
        studentList.put(student, new ArrayList<>());
    }

    public void addMark(int id, int mark) {
        for (Map.Entry<Student, List<Integer>> entry : studentList.entrySet()) {
            if (entry.getKey().getId() == id) {
                entry.getValue().add(mark);
            }
        }
    }


}
