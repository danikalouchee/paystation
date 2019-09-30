package paystation.domain;

import java.util.Calendar;
import java.util.Date;
//to get day of week
import java.util.GregorianCalendar;
/**
 *
 * @author dani
 */
public class CheckWeekendImpl implements CheckWeekend {
    
    @Override
    public boolean isWeekend(){
        Date date = new Date();
        Calendar cal = new GregorianCalendar();
        cal.setTime(date);
        
        //get day of week
        int day = cal.get(Calendar.DAY_OF_WEEK);
        //return true if weekend
        return day == Calendar.SATURDAY || day == Calendar.SUNDAY;
    }
    
}
