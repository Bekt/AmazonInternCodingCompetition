// Question 2

import java.util.*;

public class States {

	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		List<State> states = new ArrayList<State>();
		int n = in.nextInt();
		for (int i = 0; i < n; i++) {
			states.add(new State(i, in.nextInt(), in.nextInt()));
		}
		in.nextLine();
		solve(states, in.nextLine().toCharArray());
	}
	
	static void solve(List<State> states, char[] inst) {
		State st = states.get(0);
		for (int i = 0; i < inst.length; i++) {
			System.out.print(st.id + ", ");
			st = inst[i] == '0' ? states.get(st.zero) : states.get(st.one);
		}
		System.out.println(st.id);
	}

	static class State {
		int id, zero, one;
		public State(int d, int z, int o) { id = d; zero = z; one = o;}
	}
}
