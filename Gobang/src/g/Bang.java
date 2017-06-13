package g;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import g.Gobang;
public class Bang {

	public static void main(String[] args) throws IOException {
		Gobang gb=new Gobang();
		gb.initBoard();
		gb.printBoard();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String inputStr=null;
		while((inputStr=br.readLine())!=null){
			String[] posStrArr=inputStr.split(",");
			int xPos=Integer.parseInt(posStrArr[0]);
			int yPos=Integer.parseInt(posStrArr[1]);
			gb.board[yPos-1][xPos-1]="O";
			gb.printBoard();
			System.out.println("请输入您下棋的坐标，应以x，y的形式：");
		}
	}

}
