package tp1;
import java.util.Scanner;
public class Exercice7 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t[] = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = sc.nextInt();
        }
        int max = t[0];
        for (int i = 1; i < n; i++) {
            if (t[i] > max) max = t[i];
        }
        System.out.println(max);
    }

}
