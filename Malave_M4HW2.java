import java.util.Scanner;

public class Malave_M4HW2 {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in); 
     
         boolean eighteenElection;
        boolean usCitizen;
        boolean livesinCounty;
        int daysinCounty;
         boolean felonyorProbation;

     System.out.print("Will you be 18 by the date of the general election (True or False): ");
     eighteenElection= input.nextBoolean();   

     System.out.print("Are you a U.S. citizen? (True or False): ");
     usCitizen= input.nextBoolean();
     
     System.out.print("Do you currently live in the county where you are registering to vote? (True or False): ");
     livesinCounty= input.nextBoolean();
     
     System.out.print("How many days have you lived the county: ");
     daysinCounty= input.nextInt();

     System.out.print("Are you currently serving a felony or on probation? (True or False):");
     felonyorProbation= input.nextBoolean();
     
     if (eighteenElection && usCitizen && livesinCounty && daysinCounty >=30 && !felonyorProbation){
            System.out.println("You are eligible to vote! ");
     } else {
        System.out.println("You are not eligible to vote. ");
     }

     input.close();
    }
}
