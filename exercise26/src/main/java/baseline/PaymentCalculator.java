package baseline;
// create class PaymentCalculator with a public method called calculateMonthsUntilPaidOff,
// which takes no parameters and returns the number of months.as per constraint
public class PaymentCalculator extends Solution26 {

    // months is an integer value so we create method of return type integer
    public static int calculateMonthsUntilPaidOff() {
        // formula is n = -(1/30) * log(1 + b/p * (1 - (1 + i)^30)) / log(1 + i)
        //convert APR to decimal
        double apr = APR/ 100.0;
        double dailyRate = apr/ 365;
        // round balance to the nearest cent
        double roundBalance = Math.ceil(balance * 100.0) / 100.0;
        double log1 = (1 + roundBalance/monthlyPayment * (1 - Math.pow(1 + dailyRate, 30)));
        double calc = -1 * (1/30) * Math.log(log1) / Math.log(1 + dailyRate);

       
        // return number of months
        return (int)Math.ceil(-1 * ((1/30) * Math.log(1 + roundBalance/monthlyPayment * (1 - Math.pow(1 + dailyRate, 30)) /
                Math.log(1 + dailyRate))));
    }
}