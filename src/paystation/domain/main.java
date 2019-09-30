package paystation.domain;
import java.util.Map;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        
        PayStationImpl ps = new PayStationImpl();
        
        boolean menu = true;
        
        while(menu == true) {
            int choice;
            System.out.println(
                "Main Menu: Enter a digit for requested action.\n" +
                "1 = Deposit Coins\n" +
                "2 = Display\n" +
                "3 = Buy Ticket\n" +
                "4 = Cancel\n" +
                "5 = Change Rate Strategy\n" +
                "6 = Leave Paystation/Quit"
           
            );
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            
            switch(choice) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    Receipt receipt = ps.buy();
                    System.out.println("Thanks for your purchase. Please take the receipt " + receipt.value());
                    System.out.print("Do you want to continue? 1 for Yes and 0 for No: ");
                    int answer = scan.nextInt();
                    if (answer == 0)
                        choice = 6;
                    break;
                case 4:
                    
                    break;
                case 5: 
                    System.out.println("Please choose a Rate Strategy:");
                    System.out.println("1 = Linear Rate Strategy (Alphatown)");
                    System.out.println("2 = Progressive Rate Strategy (Betatown)");
                    System.out.println("3 = Alternating Rate Strategy (Gammatown)");
                    
                    int strat = scan.nextInt();
                    
                    if(strat < 1 || strat > 3) {
                        System.out.println("Invalid Option, Please enter an existing strategy");
                        break;
                    } else {
                      switch(strat) {
                          case 1: 
                              ps.switchStrat(new LinearRateStrategy());
                              break;
                          case 2:
                              ps.switchStrat(new ProgressiveRateStrategy());
                              break;
                          case 3:
                              ps.switchStrat(new AlternatingRateStrategy(new LinearRateStrategy(),new ProgressiveRateStrategy(), new CheckWeekendImpl()));
                          default:
                              break; 
                      }
                    }
                    
                    
                    break;
                case 6: 
                    break;
                default: 
                    break;
            }
            menu = false;
        }
        System.out.println("Thank you for using our Paystation! Come again!");
        
    }
    
}
