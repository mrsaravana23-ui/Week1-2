public class VolOfEarth{
    public static void main(String[] args) {
        double pi=3.14,RdKm=6378.0,parameter=1.6;
        double RdMile=RdKm/parameter;
        double VolKm=(4.0/3.0)*pi*(Math.pow(RdKm, 3));
        double VolMile=(4.0/3.0)*pi*(Math.pow(RdMile, 3)); 
        System.out.println("The volume of earth in cubic kilometers is "+VolKm+" and cubic miles is "+VolMile);
    }
}