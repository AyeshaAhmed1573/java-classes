public class Rect extends Main {
    //Define a method named calculateArea that takes the length and width of a rectangle as parameters and returns the area.


    public static void main(String[]args){
        Rectangle r1= new Rectangle();
        System.out.println(r1.getArea());

    }
}
class Rectangle extends BMI {
    double length = 5;
    double width = 8;

    double getArea() {
        return length * width;
    }

    Rectangle() {
    }

    Rectangle(double l, double w, double weight) {
        this.length = l;
        this.width = w;
        this.weight = weight;
    }
}

