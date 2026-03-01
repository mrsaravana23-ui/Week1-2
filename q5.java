public class PenSplit{
    public static void main(String[] args) {
        int pen=14;
        int PenPerStudent=pen/3;
        int BalancePen=pen%3;
        System.out.println("The Pen Per Student is "+PenPerStudent+" and the remaining pen not distributed is "+BalancePen);
    }
}