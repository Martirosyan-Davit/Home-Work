public class Car {
    private String make;
    private String model;
    private String color;
    private int year;
    private int speed;

    public void drive(int speed) {

        this.speed = speed;

        if (speed > 0) {

        } else {
            System.out.println("Argument isn't valid");
        }
    }

    public void stop() {
        this.speed = 0;
    }

    public void displayInfo() {
        System.out.println("Make"+ " " + this.make);
        System.out.println("Model"+ " "+ this.model);
        System.out.println("Year"+ " "+ this.year);
        System.out.println("Color"+ " "+ this.color);

    }

    public Car(String make, String model, String color,int year){
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year; 
    }
    
}
