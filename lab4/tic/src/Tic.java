import static org.junit.jupiter.api.Assertions.assertEquals;

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
	public void placeO(int row,int col){
		if(row>this.rows || col>this.cols){
			return;
		}
	this.board[row][col] ="o";
	}

	public boolean fullRow(int row) {
		String value = this.board[row][0];
		for(int i=0; i<this.cols; i++){
			if(this.board[row][i]!=value){
				return false;
			}
		}
		return true;
	}

	public boolean fullCol(int col) {
		String value = this.board[0][col];
		for(int i=0; i<this.rows; i++){
			if(this.board[i][col]!=value){
				return false;
			}
		}
		return true;
	}
	
/**
	 * Get all the empty cells
	 * @param row
	 * @param col
	 * @return 	count: count the number of empty cells
	 * 			-1: parameter error
	 */
	public int getAllEmpty(int row, int col) {
		int count = 0;
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<col; j++) {
				
				if(board[i][j] == "_") {
					count++;
				}
			}
		}
		return count;
	}

	
	public boolean add(int row, int col, String value) {
		row--;
		col--;
		if(row < 0 || row >= this.rows || col < 0 || col >=this.cols) {
			return false;// "" is caused by an invalid row/col
		}
		board[row][col] = value;
		return true;
	}

	public int isOccupiedX(int row, int col) {
		row--;
		col--;
		if(row < 0 || row >= this.rows || col < 0 || col >= this.cols) {
			return -1;// "" is caused by an invalid row/col
		}
		if(board[row][col] == "X") {
			return 1;
		}
		else if (board[row][col] == "O"){
			return 0;
		}
		else {
			return 0;
		}
	}
	
}
