
import java.util.Scanner;

public class FeetToYardMile{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance in Feet : ");
        double feet=sc.nextDouble();
        double parameter1=3,parameter2=1760;
        double yard=feet/parameter1;
        double mile=yard/parameter2;
        System.out.println("The distance in yards is "+yard+" while the distance in miles is "+mile);
    }
}