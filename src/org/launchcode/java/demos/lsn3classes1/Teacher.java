package org.launchcode.java.demos.lsn3classes1;

public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public void setFirstName(String name) {
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setYearsTeaching(int years) {
        this.yearsTeaching = years;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getSubject() {
        return this.subject;
    }

    public int getYearsTeaching() {
        return this.yearsTeaching;
    }
}
