
import java.util.Scanner;

public class Height{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Height in cm : ");
        double HtInCm=sc.nextDouble();
        double parameter1=2.54,parameter2=12;
        double HtInInches=HtInCm/parameter1;
        double HtInFeet=HtInInches/parameter2;
        System.out.println("Your Height in cm is "+HtInCm+" while in feet is "+HtInFeet+" and inches is "+HtInInches);
    }
}