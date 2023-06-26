
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TicTest {

	@Test
	void test() {
		Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3,3);
		assertEquals(board, board2);
		//testing ability to declare a board
	}


	Tic tic = new Tic(0, 0);
	 @Test 
    public void test_defaultboard(){
        String[][] result = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
        assertTrue(Arrays.deepEquals(result,tic.default_Board()));
    }


	@Test
	void test2() {
		Tic tic = new Tic(3,3);
		assertEquals("_", tic.board[1][1]);
	}


	
}
