
import java.util.Scanner;

public class NumberSwap{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1 : ");
        double num1=sc.nextDouble();
        System.out.println("Enter Number 2 : ");
        double num2=sc.nextDouble();
        double temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("The swapped numbers are "+num1+" and "+num2);
    }
}