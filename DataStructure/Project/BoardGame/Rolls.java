public class Rolls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Counter [] rolls = new Counter [7];

		for (int i = 1; i < 7; i++) {

			rolls[i] = new Counter ("side" + i);

		}

		for (int i = 0; i < 30; i++) {

			int side = (int) (Math.random() * 6 + 1);

			rolls[side].increment();
		}
		System.out.println("Number of");
		System.out.println("Occurrences\tSide");

		for (int i = 1; i < 7; i++) {
			System.out.println(rolls[i]);
		}
	}

}
