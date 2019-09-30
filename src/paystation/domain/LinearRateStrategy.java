package paystation.domain;

/**
 *
 * @author dani
 * created 9/30/2019
 */
public class LinearRateStrategy implements RateStrategy {
    
    /**
     * Calculates time based on coins inserted
     * @param moneyInserted is amount inserted
     * @return time bought based on linear rate strategy
     */
    @Override
    public int calculateTime(int moneyInserted){
        return (moneyInserted*2)/5;
    }
}
