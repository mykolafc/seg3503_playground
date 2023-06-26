
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
       Tic board=new Tic(3,3);
		board.placeO(1,1);
		assertEquals(board.board[1][1],"x");	
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

	@Test
	public void test6() {
		Tic tic = new Tic(3, 3);
		for(int i=0; i<3; i++){
			tic.board[0][i] = "X";
		}
		assertTrue(tic.fullRow(1));
	}

	@Test
    public void test7() {
        String[][] result = {{"_","_","_"},{"_","_","_"}};
        assertTrue(Arrays.deepEquals(result,tic.emptyboard(4,3)));//2
    }

	@Test
	public void test8() {
		Tic tic = new Tic(3, 3);
		for(int i=0; i<3; i++){
			tic.board[i][0] = "O";
		}
		assertTrue(tic.fullCol(1));
	}

	@Test
	public void test9(){
		Tic board=new Tic(3,3);
		board.placeX(1,1);
		assertEquals(board.board[1][1],"o");
	}
}
