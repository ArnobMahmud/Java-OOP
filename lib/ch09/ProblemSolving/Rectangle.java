package ch09.ProblemSolving;

public class Rectangle extends Shape {

    double res;

    Rectangle(double height, double width) {
        super(height, width);
    }

    @Override
    void area() {
        res = 0.5 * dim1 * dim2;
        System.out.println("Area of Rectangle : " + res);
    }
}
