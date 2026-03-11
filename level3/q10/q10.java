
import java.util.Scanner;

public class Handshakes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no.of Students : ");
        int n=sc.nextInt();
        int combinations=(n * (n - 1)) / 2;
        System.out.println("No.of Possible Handshakes : "+combinations);
    }
}