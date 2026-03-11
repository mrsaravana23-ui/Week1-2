
import java.util.Scanner;

public class AthleteRounds{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Distance of Side 1 in Triangular Park in meters : ");
        double side1=sc.nextDouble();
        System.out.println("Enter Distance of Side 2 in Triangular Park in meters : ");
        double side2=sc.nextDouble();
        System.out.println("Enter Distance of Side 3 in Triangular Park in meters : ");
        double side3=sc.nextDouble();
        double perimeter=side1+side2+side3;
        double parameter=5000;//5km=5000m
        double NoOfRounds=parameter/perimeter;
        System.out.println("The total number of rounds the athlete will run is "+NoOfRounds+" to complete 5 km");
    }
}