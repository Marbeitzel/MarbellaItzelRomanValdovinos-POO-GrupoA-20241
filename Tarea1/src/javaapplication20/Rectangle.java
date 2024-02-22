package javaapplication20;

public class Rectangle 
{
    double Breadth;
    double height;
    
    public Rectangle(double Breadth, double height)
    {
        this.Breadth = Breadth; 
        this.height = height;
    }
    
    public double  Area(){
    double area=0;
    area=Breadth*height;
    return area;
    }   
    
    public double Perimetro(){
        double perimetro=0;
        perimetro=Breadth*2+height*2;
        return perimetro;
    }
}
