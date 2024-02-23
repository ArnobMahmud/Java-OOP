package ch09.ProblemSolving;

public class Circle extends Shape {

    double res;

    Circle(double radius) {
        super(radius, radius);
    }

    @Override
    void area() {
        res = Math.PI * dim1 * dim2;
        System.out.println("Area of Circle : " + res);
    }

}
