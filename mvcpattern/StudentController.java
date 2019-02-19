package com.arie80.practice.mvcpattern;

public class StudentController {
    private Student model;
    private StudentView view;
    
    public StudentController(Student model, StudentView view) {
        this.model = model;
        this.view = view;
    }
    
    public void setName(String name) {
        model.setName(name);
    }
    public String getName() {
        return model.getName();
    }
    public void setId(String id) {
        model.setId(id);
    }
    public String getId() {
        return model.getId();
    }
    
    public void updateView() {
        view.displayStudentDetails(model.getName(), model.getId());
    }
}
