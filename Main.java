package academy.learnrpogramming;

public class Main {

    public static void main(String[] args)
    {
	netAmount(60,15, .85);
    }

    public static void netAmount(double hours, double hourlyRate, double netPercent)
    {
        if(hours<0 || hourlyRate<0)
        {
            System.out.println("One or more invalid values");
        }
        double netPay = (hours*hourlyRate) * netPercent;
        System.out.println("Net Amount Per Paycheck - " + netPay);

        double netMonthlyPay = (netPay*2);
        System.out.println("Net Amount Per Month - " + netMonthlyPay);

        double netAnnualPay = (netPay*24);
        System.out.println("Net Amount Per Year - " + netAnnualPay);
    }
}