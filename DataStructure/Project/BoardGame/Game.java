public class Project2 {

	public static void increment(Counter c, int num) {
		for (int i = 1; i <= num; i++)
			c.increment();
	}

	public static Counter switchUsers(Counter whoseTurn, Counter me, Counter computer) {

		if (me == whoseTurn)

			whoseTurn = computer;

		else
			whoseTurn = me;

		return whoseTurn;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUM_OF_SPACES = 30;

		final int EXPRESS_LINE = 13;

		final int PAY_DAY_1 = 6;

		final int PAY_DAY_2 = 23;

		Counter me = new Counter("Junhong");

		Counter computer = new Counter("Computer");

		Counter whoseTurn = me;

		Scanner sc = new Scanner(System.in);

		while (me.tally() < NUM_OF_SPACES && computer.tally() < NUM_OF_SPACES) {

			int spin = (int) (Math.random() * 10 + 1);

			increment(whoseTurn, spin);

			if (whoseTurn == me) {

				System.out.print("Your Turn. Press ENTER to spin: ");
				sc.nextLine();
			}

			else if (whoseTurn == computer)

				System.out.println("Computer's Turn.");

			System.out.println("The spinner shows: " + spin);
			System.out.println(whoseTurn);
			System.out.println(" ");

			if (whoseTurn.tally() != PAY_DAY_1 && whoseTurn.tally() != PAY_DAY_2 && me.tally() < NUM_OF_SPACES
					&& computer.tally() < NUM_OF_SPACES) {

				if (whoseTurn.tally() == EXPRESS_LINE) {

					increment(whoseTurn, 8);
					System.out.println("Express Line, " + whoseTurn);
				}

				whoseTurn = switchUsers(whoseTurn, me, computer);
			}
			if (whoseTurn.tally() == PAY_DAY_1 || whoseTurn.tally() == PAY_DAY_2)

				System.out.println("Land On Payday: Spin again!\n");

		}
		System.out.println("The winner is: " + whoseTurn);

	}
}
