/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 jiahao Zhu
 */
import java.util.Scanner;

public class SalesTaxCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the order amount");
        double tax = 0.05;
        int orderAmount = scan.nextInt();
        scan.nextLine();
        System.out.println("What state do you live in?");
        String state = scan.nextLine();
        if (state.equals("Wisconsin"))
        {
            System.out.println("What county do you live in?");
            String country = scan.nextLine();
            switch (country)
            {
                case "Eau Claire":tax += 0.005;
                break;
                case "Dunn":tax +=0.004;
                break;
                default:
                    break;
            }
            System.out.println("The tax is $" +(tax * orderAmount) +".\nThe total is $" + (orderAmount + (tax * orderAmount)));
        }
        else if(state.equals("Illinois"))
        {
            tax = 0.08;
            System.out.println("The tax is $" +(tax * orderAmount) +".\nThe total is $" + (orderAmount + (tax * orderAmount)));
        }
        else
        {
            System.out.println("The total is $" + orderAmount);
        }
    }
}
