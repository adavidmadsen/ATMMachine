package com.company;

public class Main
{

    public static void main(String[] args)
    {
        final double CONVENIENCE_FEE = 1.00;
        final double PER_BILL_FEE = 0.10;


        int withdrawal = 137;


        int numberOfTwenties = withdrawal / 20;
        int remainingAmount = withdrawal % 20;



        int numberOfTens = remainingAmount / 10;
        remainingAmount = remainingAmount % 10;
        int numberOfFives = remainingAmount / 5;
        int numberOfOnes = remainingAmount % 5;


        int totalNumberOfBills = numberOfTwenties + numberOfTens + numberOfFives + numberOfOnes;
        double perBillTotalFee = PER_BILL_FEE * totalNumberOfBills;
        double totalFee = CONVENIENCE_FEE + perBillTotalFee;

        System.out.print("$20(" + numberOfTwenties + "), ");
        System.out.print("$10(" + numberOfTens + "), ");
        System.out.print("$5(" + numberOfFives + "), ");
        System.out.println("$1(" + numberOfOnes + ")");
        System.out.println("Total Fee: " + totalFee);


    }
}
