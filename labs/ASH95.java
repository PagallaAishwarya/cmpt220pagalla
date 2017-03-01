/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aishw
 */
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
public class ASH95 {

    public static void main(String[] args) {

        System.out.println(new Date().toString());

        GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis(1234567898765L);
        
        System.out.printf("Year: %d Month: %d Day: %d",
                calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DATE));
    }
}