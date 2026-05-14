package tp1;
import java.util.Scanner;
public class Exercice4 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int s = 0;
	        int i = 1;
	        while (i <= N) {
	            s = s + i;
	            i++;
	        }
	        System.out.println(s);
	    }
	}