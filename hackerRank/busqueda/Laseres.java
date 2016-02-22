/* package whatever; // don't place package name! */

//https://omegaup.com/arena/problem/Lamparas-o-laseres#problems

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
public class Laseres 
{
	public static char[][] map, map2;

	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan = new Scanner(System.in);
		int n =scan.nextInt();    scan.nextLine();
		map = new char[n][n];
		map2 = new char[n][n];
		String[] sarr = new String[n];
		for(int i = 0; i<n;i++){
			sarr[i] = scan.nextLine();
		}
		for(int j=0; j<n; j++){
			for(int k=0; k<n; k++){
				map[j][k] = sarr[j].charAt(k);
				map2[j][k] = sarr[j].charAt(k);
			}
		}

	}
}
