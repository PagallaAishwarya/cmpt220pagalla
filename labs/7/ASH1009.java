/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author aishw
 */
public class ASH1009 {
    public static void main(String[] args) {

        Course course = new Course("Intro to Java :)");

        // adding 20 students
        for (int i = 0; i < 20; i++) {
            course.addStudent("Student " + (i + 1));
        }

        // Displaying course name and student taking the course.
        String[] students = course.getStudents();
        System.out.println(course.getCourseName());
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%-12s ", students[i]);
            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }

        }
        System.out.println("Number of students: " + course.getNumberOfStudents());

        System.out.println("\nDropping two students from course..");
        System.out.println("Student #1 dropped.");
        course.dropStudent("Student " + (1));
        System.out.println("Student #8 dropped.");
        course.dropStudent("Student " + (8));

        System.out.println("Displaying students...\n");
        for (int i = 0; i < course.getNumberOfStudents(); i++) {
            System.out.printf("%-12s ", students[i]);

            if ((i + 1) % 5 == 0) {
                System.out.printf("\n");
            }
        }
        System.out.println("\nNumber of students: " + course.getNumberOfStudents());

    }
}

