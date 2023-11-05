package oop_lab_work;
public interface Shape
{
    void getArea(); 
    public static void main(String[]args){
        TriangleArea obj1=new TriangleArea();
        obj1.getArea();
    }

    public class TriangleArea implements Shape
    {
        @Override
    public void getArea(){
    
        int height=3 , base=7 ;
        double area=0.5*height*base;
        System.out.println("Area of triangle is : "+area);
    }
    }
    
}
      


