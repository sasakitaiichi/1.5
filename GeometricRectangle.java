package objectandclass;

public class GeometricRectangle extends Geometric{
    private double height;
    private double width;

    public GeometricRectangle() {
    }

    public GeometricRectangle(double height,double width) {
        this.height=height;
        this.width =width;
    }

    public GeometricRectangle(double height,double width,String color,boolean filled) {
        this.height=height;
        this.width=width;
        setColor(color);
        setFilled(filled);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getArea() {return height*width;}

    public void printRectangle() {
        System.out.println("The area of Rectangle is"+getArea());
    }
}
