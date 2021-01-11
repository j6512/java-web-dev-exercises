package org.launchcode.java.demos.lsn3classes1;

public class SchoolPractice {
    public static void main(String[] args) {
        // Instantiate your Student class for part 2 here!
        Student justin = new Student("justin", 6512, 1, 4.0);
        System.out.println(justin.getName());
        System.out.println(justin.getStudentId());
        System.out.println(justin.getNumberOfCredits());
        System.out.println(justin.getGpa());

        System.out.println(justin.toString());

    }
}
