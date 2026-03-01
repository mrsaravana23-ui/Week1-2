
import java.util.Scanner;

public class KmToMileConverter{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Give Distance in Km : ");
        double DistInKm=sc.nextDouble();
        double parameter=1.6;
        double DistInMile=DistInKm/parameter;
        System.out.println("The total miles is "+DistInMile+" mile for the given "+DistInKm);
    }
}