public class Main {

   public static void main(String[] args) {
        float deposit = 1000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;

        float realInterest = intrestValue( deposit, numDays, interestRate, daysInYear );

       System.out.println("Value of real interest equals: " + realInterest);

        float realTax = taxValue(realInterest, tax);

       System.out.println("Value of real tax equals: " + realTax);

        float realProfit = profitValue(realInterest, realTax );

       System.out.println("Investment return equals: " + realProfit);
   }

   public static float intrestValue (float deposit, float numDays, float intrestRate, float daysInYear) {
               return (deposit * numDays * intrestRate / daysInYear);
   }

   public static float taxValue (float intrest, float tax) {
        return intrest * tax;
   }

   public static float profitValue (float intrest, float taxValue) {
       return intrest - taxValue;
   }
}