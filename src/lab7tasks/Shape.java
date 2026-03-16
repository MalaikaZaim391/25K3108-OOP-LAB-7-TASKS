package lab7tasks;

public class Shape {
    void area(){
        System.out.println("Calculating Area");
    }
}

class Circle extends Shape {
    @Override
    void area(){
        int radius = 5;
        double area = 3.142 * radius * radius;
        System.out.println("Area of Circle is: " + area);
    }
}

class Rectangle extends Shape {
    @Override
    void area(){
        int length = 5; int width = 7;
        double area = length * width;
        System.out.println("Area of Rectangle is: " + area);
    }
}

class Triangle extends Shape {
    @Override
    void area(){
        int height = 5; int base = 7;
        double area = 0.5 * height * base;
        System.out.println("Area of Triangle is: " + area);
    }
}

class main2{
    public static void main(String[] args) {
        Shape circ = new Circle();
        Shape tri = new Triangle();
        Shape rec = new Rectangle();
        circ.area();
        tri.area();
        rec.area();
    }
}
