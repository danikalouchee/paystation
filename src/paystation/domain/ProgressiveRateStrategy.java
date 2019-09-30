package paystation.domain;

/**
 *
 * @author dani
 * created 9/30/2019
 */
public class ProgressiveRateStrategy implements RateStrategy {
    
    /**
     * calculates time using progressive strategy
     * 5 center gives 2 minutes for first hour, 1.5 minutes for second
     * hour and 1 minute for the third hour
     * @param moneyInserted is the amount of money inserted in coin value
     * @return time bought
     */
    @Override
    public int calculateTime(int moneyInserted){
        int time = 0;
        
        // greated than 2 hours
        if(moneyInserted >= 350){
            time = (moneyInserted-350)/(5+120);
        } 
        // between 1st hour and 2nd hour 
        else if(moneyInserted >= 150){
            time = (moneyInserted-150) * (3/10) + 60;
        } 
        // less than an hour
        else {
            time = (moneyInserted *2)/5;
        }
        return time;
    }
}
