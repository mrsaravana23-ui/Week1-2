

import java.util.Scanner;

public class Division{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        double num1=sc.nextDouble();
        System.out.println("Enter Number 2 : ");
        double num2=sc.nextDouble();
        double quotient=(int)(num1/num2);
        double remainder=num1%num2;
        System.out.println("The Quotient is "+quotient+" and Reminder is "+remainder+" of two number "+num1+" and "+num2);

    }
}