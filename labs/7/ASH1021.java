/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author aishw
 */
import java.math.BigDecimal;
public class ASH1021 {
    
    public static void main(String[] args) {

        int count = 0;
        BigDecimal num = new BigDecimal(Long.MAX_VALUE).add(BigDecimal.ONE);
        while (count < 10) {

            if (num.remainder(new BigDecimal(5)).equals(BigDecimal.ZERO) ||
                num.remainder(new BigDecimal(6)).equals(BigDecimal.ZERO)) {
                count++;
                System.out.println(count+ ": " +num);
            }
            num = num.add(BigDecimal.ONE);
        }
    }
}
    
