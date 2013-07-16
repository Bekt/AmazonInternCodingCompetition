// Question 4

import java.util.Scanner;

public class Proteins {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int h = in.nextInt(), v = in.nextInt();
		in.nextLine();
		System.out.println(solve(h, v, in.nextLine().toCharArray()));
	}

	static int solve(int h, int v, char[] str) {
		int count = 0;
		for (int i = 0; i < str.length-1; i++) {
			if (str[i] == 'H' && ((i + 1) % h != 0) && str[i] == str[i + 1]) {
				count++;
			}
			if (str[i] == 'H' && i < str.length - h && str[i] == str[i + h]) {
				count++;
			}
		}
		return count;
	}
}
