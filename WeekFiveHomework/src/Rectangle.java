public class Rectangle {
   // 9.1
    private double width = 1;
    private double height = 1;

    public Rectangle(){
        width = 1;
        height = 1;
    }

    public Rectangle(double width, double height){
        this.height = height;
        this.width = width;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
