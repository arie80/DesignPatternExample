package com.arie80.practice.daopattern;

public class DaoPatternDemo {

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDaoImpl();
        
        for (Student student: studentDao.getAllStudents()) {
            System.out.println("Student: ID No: " + student.getId() + " Name: " + student.getName());
        }
        
        Student student = studentDao.getStudent(0);
        student.setName("Bobby");
        studentDao.updateStudent(student);
        
        studentDao.getStudent(0);
        System.out.println("Student: ID No: " + student.getId() + " Name: " + student.getName());
        
    }

}
