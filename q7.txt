
import java.util.Scanner;

public class ChocolateSplit{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No.of Chocolates : ");
        int numberOfchocolates=sc.nextInt();
        System.out.println("Enter No.of Children : ");
        int numberOfchildren=sc.nextInt();
        int ChocolatePerChild=numberOfchocolates/numberOfchildren;
        int remainingChocolate=numberOfchocolates%numberOfchildren;
        System.out.println("The number of chocolates each child gets is "+ChocolatePerChild+" and the number of remaining chocolates are "+remainingChocolate);
    }
}