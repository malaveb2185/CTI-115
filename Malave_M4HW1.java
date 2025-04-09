import java.util.Scanner;

public class Malave_M4HW1 {
    public static void main(String[] args) {
        
     final double widget_price = 4.79;
     final double base_salary = 2000;   

    Scanner input = new Scanner (System.in);
    System.out.print("Enter the name of Salesperson: ");
    String name= input.nextLine();

    System.out.print("Enter number of widgets sold: ");
    int widgets_sold = input.nextInt();

    System.out.print("Enter number of widgets returned: ");
    int widgets_returned= input.nextInt();
    
    int net_widgets = widgets_sold - widgets_returned;
    double sales_amount = net_widgets * widget_price;
    double commission_rate;
    
    if(net_widgets > 0 && net_widgets < 100 ){
        commission_rate= 0.10;
    } else if (net_widgets > 101 && net_widgets < 199) {
        commission_rate = 0.15;
    } else if (net_widgets > 200 && net_widgets < 299){
        commission_rate= 0.20;
    }else {
        commission_rate= 0.25;
    }


    double commission_amount= sales_amount * commission_rate;
    double salary = base_salary + commission_amount;


    System.out.print("Salesperson: " + name);
    System.out.print("Net widgets sold: " + net_widgets);
    System.out.print("Widgets sales amount: " + sales_amount);
    System.out.print("Commission Amount: " + commission_amount);
    System.out.print("Monthly salary: " + salary);

        input.close();
    }

}
