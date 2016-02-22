import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String space, symbol;
        space = " "; symbol = "#";
        for(int i = 1; i<=n; i++){
            int spaces = n-i;
            for(int j = 0; j<spaces; j++){
                System.out.print(space);
            }
            for(int k = 0; k<i; k++){
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}
