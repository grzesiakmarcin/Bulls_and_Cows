import java.rmi.MarshalException;

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape{
    double a;
    double b;
    double c;


    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

        @Override
        double getPerimeter() {
            return a+b+c;
        }

        @Override
        double getArea() {
            double p = 0.5*(a+b+c);
            return Math.sqrt(p*(p-a)*(p-b)*(p-c));
        }





}


class Rectangle extends Shape{

    double a;
    double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }


    @Override
    double getPerimeter() {
        return 2*a+2*b;
    }

    @Override
    double getArea() {
        return a*b;
    }
}




class Circle extends Shape{
    double radius;

    public Circle (double radius){
        this.radius=radius;
    }

    @Override
public double getPerimeter(){
        return 2*Math.PI*radius;

    }
    @Override
    public double getArea(){
        return Math.PI* Math.pow(radius,2);
    }
}