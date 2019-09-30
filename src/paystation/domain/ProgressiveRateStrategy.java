package paystation.domain;

/**
 *
 * @author dani
 * created 9/30/2019
 */
public class ProgressiveRateStrategy implements RateStrategy {
    
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
