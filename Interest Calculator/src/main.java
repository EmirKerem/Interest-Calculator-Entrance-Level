
import java.util.Scanner;;


public class main {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Welcome");
        System.out.println("Choose the Most Suitable Interest Type for Yourself");
        System.out.println("Interest Types: Simple - Compound");
        String interest = scanner.nextLine();
        //BASIC INTEREST
        if ("Simple".equals(interest)) {
            System.out.println("Please Enter the Interest Rate (Annual))");
            double interest_percentage = scanner.nextDouble();
            
            System.out.println("Please Enter How Many Months Interest Will Be Applied");
            double time = scanner.nextDouble();
            
            System.out.println("Please Enter Your Principal");
            double money = scanner.nextDouble();
            scanner.nextLine(); //dummy
            
            System.out.println("Please Enter Your Currency");
            String currency = scanner.nextLine();
            
            double profit = money * (interest_percentage / 100) * (time / 12);
            System.out.println("Your Earnings = " + profit + currency);
    }   //COMPOUND INTEREST
        else if ("Compound".equals(interest)) {
            
            System.out.println("Please Enter the Interest Rate (Annual)");
            double interest_percentage = scanner.nextDouble();
            
            System.out.println("Please Enter How Many Months Interest Will Be Applied");
            double time = scanner.nextDouble();
            
            System.out.println("Please Enter Your Principal");
            double money = scanner.nextDouble();
            scanner.nextLine(); //dummy
            
            System.out.println("Please Enter Your Currency");
            String currency = scanner.nextLine();
            
            double profit =money * Math.pow((1 + (interest_percentage / 100)), (time / 12)) - money;
            System.out.println("Your Earnings = " + profit + currency);
         }
        //ERROR MESSAGE
        else 
            System.out.println("Please Return to the Start and Ensure You Made a Valid Choice");
                
                
    }
    
}
