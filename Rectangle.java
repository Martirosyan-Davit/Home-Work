public class Rectangle {
    private double width;
    private double length;
    
    public Rectangle(double width, double length){
        if (width < 0 && length < 0) {
            this.width = width;
            this.length = length;
        }
        

    }
   public double calculateArea() {

        return this.width * this.length;

   }
public double calculatePerimeter(){

        return 2 * (this.width + this.length);
}

}

