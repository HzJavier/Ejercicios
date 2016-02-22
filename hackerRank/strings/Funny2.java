import java.math.*;

public class Funny2{
//Math.log(num) / Math.log(2);
  public static int c;

  public static void checar(double d){
    double result = Math.log(d)/Math.log(2);
    System.out.println("log: "+result);

    if ((result == Math.floor(result)) && !Double.isInfinite(result)) {
      System.out.println("number is integer");
      c++;
    }

  }

  public static void main(String[] args) {
    c = 0;
    String s1 = "33579";
    for (int i=0; i<s1.length() ;i++ ) {
      for (int j = i+1; j<=s1.length(); j++) {
        String stemp = s1.substring(i,j);
        //checar que no empiece con cero
        if(stemp.charAt(0)!= '0'){
          System.out.println("group: "+stemp);
          checar(Double.parseDouble(stemp));
        }
      }
    }
    System.out.println(c);
  }
}
