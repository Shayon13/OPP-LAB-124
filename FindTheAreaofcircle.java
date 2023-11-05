package Findarea;
import java.util.Scanner;
public class FindTheArea {
    double radius;
    double pi = 3.1416;
    double answer;   
    FindTheArea()
    {
        AreaOfcircle();
    }
    
    public static void main(String[] args)
    {
      FindTheArea area=new FindTheArea();
    }
    void AreaOfcircle()
    {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter the radius : ");
      radius=input.nextDouble();
      answer = pi*(radius*radius);
      System.out.print("Circle of area is : "+answer);  
    }
}
