public class Owner extends Person {
    public Owner(String name, String gender, int age) {
        super(name, gender, age);
    }
    BankAccount bankAccount;


  public void create(){
    bankAccount = new BankAccount();
  }     
}
