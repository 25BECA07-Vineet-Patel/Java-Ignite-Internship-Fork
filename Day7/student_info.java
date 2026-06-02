class Student {

    String name;
    int age;
    private double marks;

    Student(String name, int age, double marks) {
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    void display() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Marks : " + marks);
        System.out.println();
    }
}

public class student_info {
    public static void main(String[] args) {

        Student s1 = new Student("Vineet", 18, 85.5);
        Student s2 = new Student("Rahul", 19, 92.0);

        s1.display();
        s2.display();
    }
}