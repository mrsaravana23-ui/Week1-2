
import java.util.Scanner;

public class FeeDiscountCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Fee : ");
        double fee=sc.nextDouble();
        System.out.println("Enter Discount Percent : ");
        double discountPercent=sc.nextDouble();
        double Discount=fee*(discountPercent/100.0);
        double FinalFee=fee-Discount;
        System.out.println("The discount amount is INR "+Discount+" and final discounted fee is INR "+FinalFee);
    }
}