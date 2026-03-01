
import java.util.Scanner;

public class AreaOfTriangle{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Base in cm : ");
        double base=sc.nextDouble();
        System.out.println("Enter Height in cm : ");
        double height=sc.nextDouble();
        double parameter=6.4516;//2.54*2.54=6.4516
        double AreaInCm2=(1.0/2.0)*base*height;
        double AreaInInches2=AreaInCm2/parameter;
        System.out.println("The Area of the triangle in sq in is "+AreaInInches2+" and sq cm is "+AreaInCm2);
    }
}