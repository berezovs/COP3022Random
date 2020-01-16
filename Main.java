
public class Main {

	public static void main(String[] args) {
		// System.out.println("Hello");

		int[] list = { 10, 2, 3, 4, 6, 7 };
		int[][] repeatList;
		Repeat r = new Repeat();
		repeatList = r.repeat(list);

		for (int[] val : repeatList) {
			for (int innerArr : val) {
				System.out.print(innerArr + " ");
			}
			System.out.println();
		}

	}
}
