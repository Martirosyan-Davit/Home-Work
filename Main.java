import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // String gender = in.nextLine();
        // int age = in.nextInt();
         
        Person p = new Person(in.nextLine(), in.nextLine(),  in.nextInt());
        p.displayInfo();
    }
    Owner ow = new Owner("asfsa", "safas", 20);
    ow.create();

}