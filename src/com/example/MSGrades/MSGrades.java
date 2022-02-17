package com.example.MSGrades;
import java.util.ArrayList;

public class MSGrades {

    private final String[] teachers = {"Ms. Smith", "Mr. Johnson", "Mrs. Doe"};
    final private ArrayList<String> students = new ArrayList<>();
    final private ArrayList<Integer> mathGrades = new ArrayList<>();
    final private ArrayList<Integer> scienceGrades = new ArrayList<>();
    final private ArrayList<Integer> englishGrades = new ArrayList<>();

    public MSGrades() {
        // Add some students and their grades to the array lists
        students.add("John Smith");
        students.add("Jane Doe");
        mathGrades.add(70);
        mathGrades.add(82);
        scienceGrades.add(99);
        scienceGrades.add(65);
        englishGrades.add(51);
        englishGrades.add(80);
    }

    public static void main(String[] args) {
        // write your code here
        MSGrades msGrade0 = new MSGrades();
        System.out.println();
        System.out.println("Middle School Roster");
        System.out.println("====================");
        msGrade0.printStudents();
        System.out.println();
        for (int i = 0; i < msGrade0.teachers.length; i++) {
            String teacher = "Teacher: " + msGrade0.teachers[i];
            System.out.println(teacher);
        }
        System.out.println("\nStudent Grades:\n");
        for (int i = 0; i < msGrade0.students.size(); i++) {
            msGrade0.printStudentGrade(i);
            System.out.println();
        }
    }

    public void printStudents() {
        for (String student : this.students) {
            System.out.println(student);
        }
    }

    public void printStudentGrade(int studentIndex) {
        System.out.println(this.students.get(studentIndex));
        System.out.println("Math: " + this.mathGrades.get(studentIndex));
        System.out.println("Science: " + this.scienceGrades.get(studentIndex));
        System.out.println("English: " + this.englishGrades.get(studentIndex));
    }
}
