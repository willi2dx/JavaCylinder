import java.util.*;

public class Cylinder
{
   public static void main (String[] arg){
   
   final double pi = 3.14159265359;
   double area, volume;


Scanner scan = new Scanner (System.in);

System.out.println("Please enter the radius: ");
double radius = scan.nextDouble();

   area = radius * radius * pi;

System.out.println("Please enter the length: ");
double length = scan.nextDouble();

   volume = radius * length;
   
   
   System.out.println("The area is:  " + area);
   System.out.println("The volume is:  " + volume);

      }

}