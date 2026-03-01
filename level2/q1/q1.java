
import java.util.Scanner;

public class BasicCalculator{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        double number1=sc.nextDouble();
        System.out.println("Enter number 2 : ");
        double number2=sc.nextDouble();
        double add=number1+number2;
        double sub=number1-number2;
        double mult=number1*number2;
        double divi=number1/number2;
        System.out.println("The addition, subtraction, multiplication, and division value of 2 numbers "+number1+" and "+number2+" is "+add+" , "+sub+" , "+mult+" and "+divi);
    }
}