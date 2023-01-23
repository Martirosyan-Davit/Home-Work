import java.util.List;

public class Student extends Person {
    private static int studentID = 0;

    public Student(String name, String gender, int age) {
        super(name, gender, age);
        ++studentID;

    }

    private List<String> courses;

    private void addCourse(String course) {
        courses.add(course);
    }
}
