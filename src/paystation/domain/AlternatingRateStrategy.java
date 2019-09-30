package paystation.domain;

/**
 *
 * @author dani
 */
public class AlternatingRateStrategy implements RateStrategy{
    
    private RateStrategy RS_weekday, RS_weekend, currentState;
    private CheckWeekend decisionStrat; 
    
    public AlternatingRateStrategy(RateStrategy RS_weekday, RateStrategy RS_weekend, CheckWeekend decisionStrat){
        this.RS_weekday = RS_weekday;
        this.RS_weekend = RS_weekend;
        this.currentState = null;
        this.decisionStrat = decisionStrat;
    }
    
    @Override
    public int calculateTime(int moneyInserted){
        if(decisionStrat.isWeekend()){
            currentState = RS_weekend;
        } else {
            currentState = RS_weekday;
        }
        return currentState.calculateTime(moneyInserted);
    }
    
}
