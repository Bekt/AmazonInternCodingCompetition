// Question 1

import java.util.*;

public class Josephus {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		System.out.println(solve(in.nextInt(), in.nextInt()));
	}

	static int solve(int n, int k) {
		List<Integer> list = new LinkedList<Integer>();
		for (int i = 1; i <= n; i++) list.add(i);
		int index = k - 1;
		while (list.size() > 1) {
			list.remove(index);
			index = (index + k - 1) % list.size();
		}
		return list.get(0);
	}
}
