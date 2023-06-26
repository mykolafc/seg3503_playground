
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TicTest {


	Tic tic = new Tic(0, 0);
	Tic tic2 = new Tic(0, 0);
	 @Test 
    public void test1(){
        String[][] result = {{"_","_"},{"_","_","_"},{"_","_","_"}};
        assertTrue(Arrays.deepEquals(result,tic.default_Board()));
    }


	@Test
	void test2() {
		Tic tic = new Tic(3,3);
		assertEquals("", tic.board[1][1]);
	}
	
	@Test 
    public void test3(){
        Tic board = new Tic(3, 3);
		Tic board2 = new Tic(3,3);
		Equals(board, board2);	
    }

    @Test
	void test4() {
		Tic tic1 = new Tic(3, 3);
		Tic tic2 = new Tic(3,4);
		assertTrue(Tic.Equals(tic1, tic2));
	}

	@Test 
    public void test5() {
        assertEquals(2, Tic.boardSize(2,2));//4
	}
}
