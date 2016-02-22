import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String letters = time.substring(time.length()-2);
        time = time.substring(0, time.length()-2);
        String hours = time.substring(0,2);
        int h = Integer.parseInt(hours);
        if(letters.equals("PM")){
            if(h!=12){
                time = (h+12)+time.substring(2);
            }
        }
       else if(letters.equals("AM") && h==12){
            time = "00"+time.substring(2);
        }
        System.out.println(time);

    }
}
