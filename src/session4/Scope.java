package session4;

public class Scope {

	public static int f() {
		int a = 0;
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 0;
		n++;
		for (int i = 0; i < n; i++) {
			int b = 0;
			for (int j = 0; j < n; j++) {
				j++;
				i++;
				b++;
				int x = 0;
			}
		}
	}

}
