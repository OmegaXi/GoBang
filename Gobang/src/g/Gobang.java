package g;

public class Gobang {
	public static int BOARD_SIZE=15;
	String[][] board;
	public void initBoard(){
		board=new String[BOARD_SIZE][BOARD_SIZE];
		for(int i=0;i<BOARD_SIZE;i++){
			for(int j=0;j<BOARD_SIZE;j++){
				board[i][j]="+";
			}
		}
	}
	
	public void printBoard(){
		for(int i=0;i<BOARD_SIZE;i++){
			for(int j=0;j<BOARD_SIZE;j++){
				System.out.println("\n");
			}
		}
	}

}
