// Question 3

import java.util.*;

public class Sorting {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int[] arr = new int[1 << 16];
		int zero = 1 << 15;
		while(in.hasNext()) arr[zero + in.nextInt()]++;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i]; j++) {
				System.out.print((i - zero) + " ");
			}
		}
		System.out.println();
	}
}
