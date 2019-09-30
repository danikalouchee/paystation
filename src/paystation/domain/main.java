package paystation.domain;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        boolean menu = true;
        
        while(menu == true) {
            int choice;
            System.out.println(
                "Main Menu: Enter a digit for requested action.\n" +
                "1 = Deposit Coins\n" +
                "2 = Display\n" +
                "3 = Buy Ticket\n" +
                "4 = Cancel\n" +
                "5 = Change Rate Strategy\n" 
            );
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            
            switch(choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5: 
                    
                    break;
                default: 
                    break;
            }
            menu = false;
        }
        System.out.println("Thank you for using our Paystation! Come again!");
        
    }
    
}
