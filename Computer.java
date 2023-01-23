public class Computer {
    private String brand;
    private String model;
    private int year; 
    private int cpu;
    private int ram; 
    private int storage;

    public Computer(String brand, String model, int year, int cpu,  int ram, int storage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
    }
    public void  displaySpecifications() {
        System.out.println(this.brand);
        System.out.println(this.model);
        System.out.println(this.year);
        System.out.println( this.cpu);
        System.out.println(this.ram);
        System.out.println(this.storage);
    } 
    public void runProgram(String programName) {
        System.out.println(programName  +"is processing...");
    }
}
