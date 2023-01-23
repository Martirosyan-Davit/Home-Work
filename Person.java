public class Person {
    private String name;
    private int age;
    private String gender;

    public Person(String name,  String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;

    }

    public void displayInfo() {
        System.out.println("Name"+ " "+ this.name);
        System.out.println("Age"+ " "+ this.age);
        System.out.println("Gender"+ " "+ this.gender);
    }


}
