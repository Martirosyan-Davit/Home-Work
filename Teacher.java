import java.util.List;

public class Teacher extends Person {
    private static int employeeID = 0;

    public Teacher(String mane, String gender, int age) {
        super(mane, gender, age);
            ++employeeID;
    }
    private List<String> subjects;
        private void addSubject(String subject) {
            subjects.add(subject);
        }

}
