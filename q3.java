
import java.util.Scanner;

public class SideOfSquare{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter perimeter of Square : ");
        double perimeter=sc.nextDouble();
        double parameter=4;
        double side=perimeter/parameter;
        System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
    }
}