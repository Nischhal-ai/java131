package unit1;

public class prog7 {
    double area;
    public void Area(double l,double b)
    {
        area=l*b;
        System.out.println("Area of rectangle : "+area);
    }
    public void Area(double r)
    {
        area=Math.PI*r*r;
        System.out.println("Area of circle : "+area);
    }
    public void Area(double l,double b,double h)
    {
        area=2*(l*b+l*h+b*h);
        System.out.println("Area of Cuboid : "+area);
    }
}
