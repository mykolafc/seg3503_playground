
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void test() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
		//testing ability to declare a board
	}

	//Caro
	@Test
	void test1() {
		Tic board = new Tic(2, 3);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
		//testing ability to declare a board
	}

	@Test
	void test2() {
		Tic tic = new Tic(3,3);
		assertEquals("_", tic.board[1][1]);
	}

	
}
