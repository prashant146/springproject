package com.one;


public class Main {

    private Student student;
    private Teacher teacher;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }



    public void printSomething(){
        System.out.println("PRINT SOMETHING");
        student.print();
        teacher.print();
    }

}
