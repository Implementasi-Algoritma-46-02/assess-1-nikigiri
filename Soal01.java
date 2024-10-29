import java.util.Scanner;

public class Soal01 {

	public static void main(final String[] args) {
		// Kerjakan soalnya di sini
		Scanner userInput = new Scanner(System.in);
		int D = 123;
        int R = 456;
        int I = 789;
		int j = 101;
		int L = 135;
		String nomorLab;
        if (D > R && D > I) {
            nomorLab = "D";
        } else if (R > D && R > I) {
            nomorLab = "R";
        } else {
            nomorLab = "I";
        }

        System.out.println(nomorLab);
    }
}