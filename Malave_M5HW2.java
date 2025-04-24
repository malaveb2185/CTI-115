// Brandon Malave
// M5HW2
// 04/23/2025
// Calculates total monthly salary for a salesperson based on 4 weeks of widget sales and returns.

import java.util.Scanner;

public class Malave_M5HW2 {
    public static void main(String[] args) {
        final double BASE_SALARY = 2000.00;
        final double WIDGET_PRICE = 4.79;

        Scanner input = new Scanner(System.in);
        char runAgain = 'y';

        while (runAgain == 'y' || runAgain == 'Y') {
            int widgetsSold = 0;
            int widgetsReturned = 0;

            System.out.print("Enter the salesperson's name: ");
            String name = input.next();

            
            for (int i = 1; i <= 4; i++) {
                System.out.print("Enter the number of widgets sold for week " + i + ": ");
                widgetsSold += input.nextInt();
            }

        
            for (int i = 1; i <= 4; i++) {
                System.out.print("Enter the number of widgets returned for week " + i + ": ");
                widgetsReturned += input.nextInt();
            }

            int netWidgets = widgetsSold - widgetsReturned;
            double sales = netWidgets * WIDGET_PRICE;

            double commissionRate;
            if (netWidgets <= 100) {
                commissionRate = 0.10;
            } else if (netWidgets <= 199) {
                commissionRate = 0.15;
            } else if (netWidgets <= 299) {
                commissionRate = 0.20;
            } else {
                commissionRate = 0.25;
            }

            double commission = sales * commissionRate;
            double totalSalary = BASE_SALARY + commission;

            System.out.println("\nSalesperson: " + name);
            System.out.println("Net Widgets Sold: " + netWidgets);
            System.out.printf("Total Sales: $%.2f\n", sales);
            System.out.printf("Commission: $%.2f\n", commission);
            System.out.printf("Total Salary: $%.2f\n", totalSalary);

            System.out.print("\nWould you like to enter data for another salesperson? (y/n): ");
            runAgain = input.next().charAt(0);
        }

        System.out.println("Thank you for using the program!");
        input.close();
    }
}