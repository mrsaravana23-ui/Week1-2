
import java.util.Scanner;

public class TemperatureConversion{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Temperature in degree Farenheit : ");
        double farenheit=sc.nextDouble();
        double celsiusResult=(farenheit-32.0)*(5.0/9.0);
        System.out.println("The "+farenheit+" farenheit is "+celsiusResult+" celsius");
    }
}