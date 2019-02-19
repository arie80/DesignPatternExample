package com.arie80.practice.daopattern;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private List<Student> students;
    
    StudentDaoImpl() {
        students = new ArrayList<Student>();
        Student student1 = new Student("Mary", 0);
        Student student2 = new Student("John", 1);
        students.add(student1);
        students.add(student2);
    }
    
    @Override
    public List<Student> getAllStudents() {
        // TODO Auto-generated method stub
        return students;
    }

    @Override
    public Student getStudent(int id) {
        // TODO Auto-generated method stub
        return students.get(id);
    }

    @Override
    public void updateStudent(Student student) {
        students.get(student.getId()).setName(student.getName());
        System.out.println("Student: ID No " + student.getId() + " has been updated");
    }

    @Override
    public void deleteStudent(Student student) {
        students.remove(student.getId());
        System.out.println("StudentL ID No " + student.getId() + " delete from database");
    }

}
