package org.launchcode.java.demos.lsn3classes1;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private String professor;
    private ArrayList<Student> listOfStudents;

    public Course(String courseName, String professorName, ArrayList<Student> studentList) {
        this.courseName = courseName;
        this.professor = professorName;
        this.listOfStudents = studentList;
    }

    public void setCourseName(String name) {
        this.courseName = name;
    }

    public void setProfessor(String name) {
        this.professor = name;
    }

    public void setListOfStudents(ArrayList<Student> list) {
        this.listOfStudents = list;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public String getProfessor() {
        return this.professor;
    }

    public ArrayList<Student> getListOfStudents() {
        return listOfStudents;
    }
}
