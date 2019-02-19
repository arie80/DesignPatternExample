package com.arie80.practice.mvcpattern;

public class MVCPatternDemo {

    public static void main(String[] args) {

        Student model = retrieveStudentFromDb();
        StudentView view = new StudentView();
        
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        
        controller.setName("John");
        controller.setId("43");
        controller.updateView();
    }

    private static Student retrieveStudentFromDb() {
        Student student = new Student();
        student.setName("Mary");
        student.setId("23");
        return student;
    }

}
