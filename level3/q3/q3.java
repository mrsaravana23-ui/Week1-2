
import java.util.Scanner;

public class TotalSalary{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Salary of the user : ");
        double salary=sc.nextDouble();
        System.out.println("Enter Bonus of the user : ");
        double bonus=sc.nextDouble();
        double TotalSalary=salary+bonus;
        System.out.println("The salary is INR "+salary+" and bonus is INR "+bonus+" . Hence Total Income is INR "+TotalSalary);
    }
}