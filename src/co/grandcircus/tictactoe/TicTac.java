package co.grandcircus.tictactoe;

public class TicTac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	char[][] board = new char[3][3];
		
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				board[x][y] = '_';
			}
		}// end loop
		board[1][2]='x';
		board[1][0]='x';
		board[1][1]='x';
		
		
		// begin loop
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < 3; x++) {
				System.out.print(board[x][y]);
				System.out.print(' ');
			}
			System.out.println();
		}
	}

}