/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condosales;
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class CondoSales {
Scanner sc = new Scanner(System.in);
    static char view;
    static double viewPrice, downPayment, interest, years, remainBal, intRate, totalBal, amortization;
    static String viewDesc;
    
    CondoSales() {
        System.out.println("Garfield Condo Sales\nAvailable options:");
        System.out.print("\nP - Park view\nG - Golf course view\nL - Lake view\n\nSelect option: ");
        view = sc.next().charAt(0);
    }

    CondoSales(char OPTION){
        switch (view) {
            case 'P', 'p' -> {
                viewDesc = "Park view";
                viewPrice = 950000;
                downPayment = 100000;
                interest = 0.05;
                years = 5;
            }
            case 'G', 'g' -> {
                viewDesc = "Golf course view";
                viewPrice = 1300000;
                downPayment = 250000;
                interest = 0.07;
                years = 7;
            }
            case 'L', 'l' -> {
                viewDesc = "Lake view";
                viewPrice = 1550000;
                downPayment = 350000;
                interest = 0.10;
                years = 10;
            }
            default -> {
                viewDesc = "Invalid code.";
                viewPrice = 0;
            }
        }
        remainBal = viewPrice - downPayment;
        intRate = (remainBal * interest) * years;
        totalBal = remainBal + intRate;
        amortization = totalBal / (years * 12);

        System.out.println("\nSelected option: " + viewDesc);
        System.out.println("Cost: Php" + viewPrice);
        System.out.println("Downpayment: Php" + downPayment);
        System.out.println("Remaining balance after down payment: Php" + remainBal);
        System.out.println("\nInterest: " + Math.round((interest * 100)) + "%");
        System.out.println("Years to pay: " + Math.round(years) + " years");
        System.out.println("Total balance to be paid: Php" + totalBal);
        System.out.println("Monthly amortization: Php " + ((double) Math.round((amortization) * 100) / 100));
    }

    public static void main(String[] args) {
        CondoSales c = new CondoSales();
        CondoSales c1 = new CondoSales(view);
    }
}

