package ch09.ProblemSolving;

public class Triangle extends Shape {

    double res;

    Triangle(double height, double base) {
        super(height, base);
    }

    @Override
    void area() {
        res = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle : " + res);
    }

}
