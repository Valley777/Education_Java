import java.util.Scanner;

public class Cake_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		int width = Integer.parseInt(scan.nextLine());
		int length = Integer.parseInt(scan.nextLine());

		int countPieces = width * length;

		String command = scan.nextLine();

		while (!command.equals("STOP")) {

			int currentCakePieces = Integer.parseInt(command);

			countPieces -= currentCakePieces;

			if (countPieces <= 0) {
				System.out.printf("No more cake left! You need %d pieces more.", Math.abs(countPieces));
				break;
			}

			command = scan.nextLine();
		}

		if (countPieces > 0) {

			System.out.printf("%d pieces are left.", countPieces);

		}

	}

}
