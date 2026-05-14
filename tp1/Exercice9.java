package tp1;
import java.util.Scanner;
public class Exercice9 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        int s = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                s = s + m[i][j];
            }
        }
        System.out.println(s);
    }

}
