
package datedemo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Datedemo {

    
    public static void main(String[] args) {
       Date date = new Date();
        System.out.println(date);
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/YY");
        String CurrentDate = dateFormat.format(date);
        System.out.println("CurrentDate = "+CurrentDate);
    }
    
}
