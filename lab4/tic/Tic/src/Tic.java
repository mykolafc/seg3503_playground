

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
	public static String[][] default_Board(){

        String[][] board = new String[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = "_";
            }
        }

        return board;

    }

	public void writeX(int i, int j) {
		this.board[i][j] = "X";
	}

	public void writeO(int i, int j) {
		this.board[i][j] = "O";
	}

	public String getValue(int i, int j){
		return this.board[i][j];
	}
	 public static int boardSize(int indexI,int indexJ){

        return indexI*indexJ;
    }

	public static String[][] emptyboard(int indexI, int indexJ) {

        String[][] board = new String[indexI][indexJ];
        for (int i = 0; i < indexI; i++) {
            for (int j = 0; j < indexJ; j++) {
                board[i][j] = "_";
            }
        }

        return board;

    }

	public void placeX(int row,int col){
		if(row>this.rows || col>this.cols){
			return;
		}
	this.board[row][col] ="x";
	}



}
