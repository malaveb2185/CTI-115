import java.util.Scanner;
public class Malave_M4CW1{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        int majors, nonmajors;
        double total, percentMajors, percentNonmajors;

        System.out.print("Enter the number of students majoring in CS: ");
        majors= input.nextInt();

        System.out.print("Enter the number of student not majoring in CS: ");
        nonmajors= input.nextInt();

        total= majors + nonmajors;
       percentMajors= ((double) + majors / total) * 100;
       percentNonmajors= ((double) + nonmajors / total) * 100;

       System.out.println("Majors:" + percentMajors + "%");
       System.out.println("Nonmajors:" + percentNonmajors + "%");

       input.close();




















    }
}