package paystation.domain;

import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author dani
 */
public class CheckWeekendImpl implements CheckWeekend {
    
    @Override
    public boolean isWeekend(){
        return true;
    }
    
}
