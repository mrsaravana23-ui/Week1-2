
import java.util.Scanner;

public class TotalPrice{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Unit Price : ");
        double UnitPrice=sc.nextDouble();
        System.out.println("Enter Quantity : ");
        double Quantity=sc.nextDouble();
        double TotalPrice=UnitPrice*Quantity;
        System.out.println("The total purchase price is INR "+TotalPrice+" if the quantity "+Quantity+" and unit price is INR "+UnitPrice);
    }
}