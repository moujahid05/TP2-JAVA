package tp1;
import java.util.Scanner;
public class Exercice6 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int t[] = new int[10];
	        for (int i = 0; i < 10; i++) {
	            t[i] = sc.nextInt();
	        }
	        int x = sc.nextInt();
	        int pos = -1;
	        for (int i = 0; i < 10; i++) {
	            if (t[i] == x) pos = i;
	        }
	        if (pos == -1) System.out.println("Non trouve");
	        else System.out.println(pos);
	    }
	}

