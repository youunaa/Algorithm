package src.coding.test.time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Timer {
    
    public void execute() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        
        System.out.println("[" + dateFormat.format(date) + "]");
    }
    
    public void clear() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss.SSS");
        Date date = new Date();
        
        System.out.println("[" + dateFormat.format(date) + "]");
    }
    
}