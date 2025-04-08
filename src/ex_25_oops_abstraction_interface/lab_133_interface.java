package ex_25_oops_abstraction_interface;

public class lab_133_interface {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getarea(10,10);

    }
}

interface Polygon{
    void getarea(int length, int width);

}

class Rectangle implements Polygon{


    @Override
    public void getarea(int length, int width) {
        System.out.println("Area of rectangle is " + (length * width));
    }
}
