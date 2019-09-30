package paystation.domain;

/**
 *
 * @author dani
 * created 9/30/2019
 */
public class LinearRateStrategy implements RateStrategy {
    
    @Override
    public int calculateTime(int moneyInserted){
        return (moneyInserted*2)/5;
    }
}
