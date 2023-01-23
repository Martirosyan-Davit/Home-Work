
import java.util.Random;

public class BankAccount {
    private int accountNumber;
    private double balance = 0;
    {
        Random rand  = new Random();
        accountNumber = rand.nextInt(900000) + 100000;
    }

    public void deposit(double amount) {
        if (amount >= 0) {
            balance += amount;
        } 
        else {
            System.out.println("argument isn't valid");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("there is no $" + amount + "on your balance");
        } 
        else {
            balance -= amount;
        }
    }
     

}
