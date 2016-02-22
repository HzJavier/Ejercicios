import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        double cpos = 0; double cneg = 0; double czeroes = 0;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i] <0){
                cneg++;
            }
            else if(arr[arr_i] == 0){
                czeroes++;
            }
            else{
                cpos++;
            }
        }
        double p, ne, z;
        p = cpos / n;
        ne = cneg / n;
        z = czeroes / n;
        System.out.print(p+"\n"+ne+"\n"+z);
    }
}
