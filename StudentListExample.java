package MyPackage;

import java.util.ArrayList;
import java.util.List;

class StudentInfo {
    String name;
    int marks;

    StudentInfo(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class StudentListExample {
    public static void main(String[] args) {

        List<StudentInfo> students = new ArrayList<>();

        students.add(new StudentInfo("Rahul", 85));
        students.add(new StudentInfo("Sneha", 92));
        students.add(new StudentInfo("Amit", 77));

        System.out.println("Output:");
        for (StudentInfo s : students) {
            System.out.println(s.name + " - " + s.marks);
        }
    }
}
