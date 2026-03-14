
import java.util.Scanner;

public class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Principle Amount : ");
        double p=sc.nextDouble();
        System.out.println("Enter Rate of Interest : ");
        double r=sc.nextDouble();
        System.out.println("Enter Principle Time : ");
        double t=sc.nextDouble();
        double si=p*r*t*0.01;
        System.out.println("The Simple Interest is "+si+" for Principal "+p+" , Rate of Interest "+r+" and Time "+t);
    }
}