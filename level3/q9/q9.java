
import java.util.Scanner;

public class PoundsToKg{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight in Pounds : ");
        double PoundsWt=sc.nextDouble();
        double parameter=2.2;
        double KgWt=PoundsWt/parameter;
        System.out.println("The weight of the person in pounds is "+PoundsWt+" and in kg is "+KgWt);
    }
}