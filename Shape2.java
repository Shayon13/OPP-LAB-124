package oop_lab_work;
public class Shape2 {
   void area(){};
   void perimeter(){};
   int length=2,width=3;
     double area,perimeter;
    public static void main(String[] args) {
      Rectangle obj1= new Rectangle();
      obj1.area();
      obj1.perimeter();
    }
}
    class Rectangle extends Shape2
    {
        @Override
       public void area()
        {
            area=length*width;
            System.out.println("Area of rectangle is :"+area);
        }
        @Override
       public void perimeter()
       {
          perimeter=2*(length+width);
           System.out.println("Perimeter of rectangle is : "+perimeter);
       }
    }

