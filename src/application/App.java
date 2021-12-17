package application;

public class App {

	public static void main(String[] args) {

		int otters = 5;
		int giraffes = 10;
		int elephants = 3;

		System.out.printf("Animals: %d\n", otters + giraffes + elephants);

		int animals = otters++;
		/*
		 * Should output 5 otters and 6 animals since otters is not incremented when
		 * printing out animals, but is updated when printing otters
		 */
		System.out.println(animals + "\n" + otters);

		int animals2 = otters++ + otters;
		/*
		 * Should output 12 animals and 7 otters
		 * 
		 */
		System.out.println(animals2 + "\n" + otters);
		/* Got 13 animals.  Probably because otters++ is 6
		 * and then otters is 7 because the ++ has kicked in
		 */
		
		int goats = 3;
		int sheep = 5;
		int cows = 10;
		int animals3 = --goats + ++sheep + cows++ + goats;
		/* Should be 20.  (3-1) + (5+1) + 10 + 2;
		 * 
		 */
		System.out.println(animals3);
	}

}
