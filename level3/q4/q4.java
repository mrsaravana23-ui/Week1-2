mport java.util.Scanner;

public class Travel{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Name : ");
        String name=sc.nextLine();
        System.out.println("Enter Start City : ");
        String fromCity=sc.nextLine();
        System.out.println("Enter Via City : ");
        String viaCity=sc.nextLine();
        System.out.println("Enter Final City : ");
        String toCity=sc.nextLine();
        System.out.println("Enter Distance From Start to Via City in miles : ");
        double fromToViaDist=sc.nextDouble();
        System.out.println("Enter Distance From Via to Final City in miles : ");
        double ViaToFinalDist=sc.nextDouble();
        System.out.println("Enter Time Taken From Start to Via City in mins : ");
        double fromToViaTime=sc.nextDouble();
        System.out.println("Enter Time Taken From Via to Final City in mins : ");
        double ViaToFinalTime=sc.nextDouble();
        double TotalDistMiles=fromToViaDist+ViaToFinalDist;
        double TotalTime=fromToViaTime+ViaToFinalTime;
        double TotalDistKm=TotalDistMiles*1.6;
        System.out.println("The Total Distance travelled by "+name+" from "+fromCity+" to "+toCity+" via "+viaCity+" is "+TotalDistKm+" km and the Total Time taken is "+TotalTime+" minutes");
    }
}