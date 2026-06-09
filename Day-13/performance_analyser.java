import java.util.*;

class Student {

    String name;
    String course;
    int marks;

    Student(String name, String course, int marks) {
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
}

public class performance_analyser {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student("Vineet", "Java", 85));
        students.add(new Student("Rahul", "Java", 90));
        students.add(new Student("Ankit", "Python", 78));
        students.add(new Student("Priya", "Python", 88));
        students.add(new Student("Neha", "Java", 95));
        students.add(new Student("Riya", "DSA", 92));

        HashMap<String, List<Integer>> courseMarks = new HashMap<>();

        // Group marks by course
        for (Student s : students) {

            String course = s.course;

            if (!courseMarks.containsKey(course)) {
                courseMarks.put(course, new ArrayList<>());
            }

            courseMarks.get(course).add(s.marks);
        }

        String topCourse = "";
        double highestAverage = 0;

        System.out.println("Average Marks Per Course:");

        for (String course : courseMarks.keySet()) {

            List<Integer> marksList = courseMarks.get(course);

            int sum = 0;

            for (int mark : marksList) {
                sum += mark;
            }

            double average = (double) sum / marksList.size();

            System.out.println(course + " = " + average);

            if (average > highestAverage) {
                highestAverage = average;
                topCourse = course;
            }
        }

        System.out.println("\nCourse with Highest Average:");
        System.out.println(topCourse + " = " + highestAverage);
    }
}