import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Panagram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();


        final String str;

        str = input.toLowerCase().replaceAll(" ", "");

        char[] chars = str.toCharArray();

        try{
            final Set set = new HashSet();

        for(char c: chars){
            set.add(c);
        }

        if(set.size() == 26)
           System.out.println("pangram");
        else
            System.out.println("not pangram");
        }catch (Exception e) {
        e.printStackTrace();
        }

    }


}
