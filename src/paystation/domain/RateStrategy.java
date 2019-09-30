/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paystation.domain;

public interface RateStrategy {
    
    /* Calculate the time based on the money inserted */
    
    public int calculateTime(int moneyInserted);
    
}
