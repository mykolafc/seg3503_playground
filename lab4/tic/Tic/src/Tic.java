

public class Tic {
	String[][] board;
	int rows;
	int cols;
	String turn;
	public Tic(int row, int col) {
		board = new String[row][col];
		rows = row;
		cols = col;
		turn = "X";
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				board[i][j] = "_";
			}
		}
	}

	public static boolean Equals(Tic tic1, Tic tic2){

		if(tic1.rows != tic2.rows || tic1.cols != tic2.cols){
			return false;
		}

		for(int i=0; i<tic1.rows; i++){
			for(int j=0; j<tic1.cols; j++){
				if(tic1.board[i][j]!=tic2.board[i][j]){
					return false;
				}
			}
		}
		return true;
	}
}
