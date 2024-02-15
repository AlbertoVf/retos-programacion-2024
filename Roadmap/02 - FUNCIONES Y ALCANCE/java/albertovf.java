
public class albertovf {
	public static void main(String[] args) {
		int a = function("fizz", "buzz");
	}

	public static int function(String c1, String c2) {
		int MAX = 100;
		int noMultiplos = 0;
		for (int i = 1; i <= MAX; i++) {
			if (i % 3 == 0 | i % 5 == 0) {
				if (i % 3 == 0) {
					System.out.print(c1);
				}
				if (i % 5 == 0) {
					System.out.print(c2);
				}
				System.out.println();
			} else {
				System.out.println(i);
				noMultiplos++;
			}
		}
		return noMultiplos;
	}
}
