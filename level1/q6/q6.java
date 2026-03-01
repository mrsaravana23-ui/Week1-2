public class FeeDiscount{
    public static void main(String[] args) {
        double fee=125000,discountPercent=10;
        double Discount=fee*(discountPercent/100.0);
        double FinalFee=fee-Discount;
        System.out.println("The discount amount is INR "+Discount+" and final discounted fee is INR "+FinalFee);
    }
}