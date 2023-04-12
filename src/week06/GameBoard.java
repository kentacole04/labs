package week06;

public class GameBoard {
	private static char[][] gameDisplay = {{'_', '|', '_', '|', '_'},
			{'_', '|', '_', '|', '_'},
			{'_', '|', '_', '|', '_'}};
	
			
	
	
	public static char[][] getGameDisplay() {
		return gameDisplay;
	}
	
	public void playMove(char c, int position) {
		switch (position) {
		case 1:
			if (isValidMove(gameDisplay[0][0])) {
				gameDisplay[0][0] = c;
			}
			 
			break;
		case 2:
			if (isValidMove(gameDisplay[0][2])) {
				gameDisplay[0][2] = c;
			}
			break;
		case 3:
			if (isValidMove(gameDisplay[0][4])) {
				gameDisplay[0][4] = c;
			}
			break;
		case 4:
			if (isValidMove(gameDisplay[1][0])) {
				gameDisplay[1][0] = c;
			}
			break;
		case 5:
			if (isValidMove(gameDisplay[1][2])) {
				gameDisplay[1][2] = c;
			}
			break;
		case 6:
			if (isValidMove(gameDisplay[1][4])) {
				gameDisplay[1][4] = c;
			}
			break;
		case 7:
			if (isValidMove(gameDisplay[2][0])) {
				gameDisplay[2][0] = c;
			}
			break;
		case 8:
			if (isValidMove(gameDisplay[2][2])) {
				gameDisplay[2][2] = c;
			}
			break;
		case 9:
			if (isValidMove(gameDisplay[2][4])) {
				gameDisplay[2][4] = c;
			}
			break;
		default:
			break;
		}
		display();

	}
	public static void display() {
		for (char[] array: getGameDisplay()) {
			for (char c: array) {
				System.out.print(c);
			}
			System.out.println();
		}
	}
	
	public static boolean checkWinStatus() {
		if (gameDisplay[0][0] == 'X' && gameDisplay[0][2] == 'X' && gameDisplay[0][4] == 'X') {
			System.out.println("P1 wins!");
			return true;
		}
		if (gameDisplay[1][0] == 'X' && gameDisplay[1][2] == 'X' && gameDisplay[1][4] == 'X') {
			System.out.println("P1 wins!");
			return true;
		}
		if (gameDisplay[2][0] == 'X' && gameDisplay[2][2] == 'X' && gameDisplay[2][4] == 'X') {
			System.out.println("P1 wins!");
			return true;
		}
		if (gameDisplay[0][0] == 'O' && gameDisplay[0][2] == 'O' && gameDisplay[0][4] == 'O') {
			System.out.println("P2 wins!");
			return true;
		}
		if (gameDisplay[1][0] == 'O' && gameDisplay[1][2] == 'O' && gameDisplay[1][4] == 'O') {
			System.out.println("P2 wins!");
			return true;
		}
		if (gameDisplay[2][0] == 'O' && gameDisplay[2][2] == 'O' && gameDisplay[2][4] == 'O') {
			System.out.println("P2 wins!");
			return true;
		}
		if (gameDisplay[0][0] == 'X' && gameDisplay[1][0] == 'X' && gameDisplay[2][0] == 'X') {
			System.out.println("P1 wins!");
			return true;
			
		}
		if (gameDisplay[0][2] == 'X' && gameDisplay[1][2] == 'X' && gameDisplay[2][2] == 'X') {
			System.out.println("P1 wins!");
			return true;
			
		}
		if (gameDisplay[0][4] == 'X' && gameDisplay[1][4] == 'X' && gameDisplay[2][4] == 'X') {
			System.out.println("P1 wins!");
			return true;
			
		}
		if (gameDisplay[0][0] == 'O' && gameDisplay[1][0] == 'O' && gameDisplay[2][0] == 'O') {
			System.out.println("P2 wins!");
			return true;
			
		}
		if (gameDisplay[0][2] == 'O' && gameDisplay[1][2] == 'O' && gameDisplay[2][2] == 'O') {
			System.out.println("P2 wins!");
			return true;
			
		}
		if (gameDisplay[0][4] == 'O' && gameDisplay[1][4] == 'O' && gameDisplay[2][4] == 'O') {
			System.out.println("P2 wins!");
			return true;
			
		}
		if (gameDisplay[0][0] == 'X' && gameDisplay[1][2] == 'X' && gameDisplay[2][4] == 'X') {
			System.out.println("P1 wins!");
			return true;
			
		}
		if (gameDisplay[0][0] == 'O' && gameDisplay[1][2] == 'O' && gameDisplay[2][4] == 'O') {
			System.out.println("P2 wins!");
			return true;
			
		}
		if (gameDisplay[0][0] == 'O' && gameDisplay[1][2] == 'O' && gameDisplay[2][4] == 'O') {
			System.out.println("P2 wins!");
			return true;
			
		}
		if (gameDisplay[2][0] == 'X' && gameDisplay[1][2] == 'X' && gameDisplay[0][4] == 'X') {
			System.out.println("P1 wins!");
			return true;
			
		}
		if (gameDisplay[2][0] == 'O' && gameDisplay[1][2] == 'O' && gameDisplay[0][4] == 'O') {
			System.out.println("P2 wins!");
			return true;
			
		}
		if (gameDisplay[0][0] != '_' && gameDisplay[0][2] != '_' && gameDisplay[0][4] != '_'
				&& gameDisplay[1][0] != '_' && gameDisplay[1][2] != '_' && gameDisplay[1][4] != '_'
						&& gameDisplay[2][0] != '_' && gameDisplay[2][2] != '_' && gameDisplay[2][4] != '_') {
			System.out.println("It's a tie!");
			return true;
		}
		return false;
		
		
	}
	public static boolean isValidMove(char c) {
		return (c == '_');
	}
    
}
