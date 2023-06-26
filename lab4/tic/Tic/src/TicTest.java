
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

class TicTest {


	Tic tic = new Tic(0, 0);
	Tic tic2 = new Tic(0, 0);
	 @Test 
    public void test1(){
        String[][] result = {{"_","_","_"},{"_","_","_"},{"_","_","_"}};
        assertTrue(Arrays.deepEquals(result,tic.default_Board()));
    }


	@Test
	void test2() {
		Tic tic = new Tic(3,3);
		assertEquals("_", tic.board[1][1]);
	}
	
	@Test 
    public void test3(){
       Tic board=new Tic(3,3);
		board.placeO(1,1);
		assertEquals(board.board[1][1],"o");	
    }

    @Test
	void test4() {
		Tic tic1 = new Tic(3, 3);
		Tic tic2 = new Tic(3,3);
		assertTrue(Tic.Equals(tic1, tic2));
	}

	@Test 
    public void test5() {
        assertEquals(4, Tic.boardSize(2,2));
	}

	@Test
	public void test6() {
		Tic tic = new Tic(3, 3);
		for(int i=0; i<3; i++){
			tic.board[0][i] = "o";
		}
		assertTrue(tic.fullRow(2));
	}

	@Test
    public void test7() {
        String[][] result = {{"_","_","_"},{"_","_","_"}};
        assertTrue(Arrays.deepEquals(result,tic.emptyboard(2,3)));
    }

	@Test
	public void test8() {
		Tic tic = new Tic(3, 3);
		for(int i=0; i<3; i++){
			tic.board[i][0] = "X";
		}
		assertTrue(tic.fullCol(1));
	}

	@Test
	public void test9(){
		Tic board=new Tic(3,3);
		board.placeX(1,1);
		assertEquals(board.board[1][1],"x");
	}

	@Test
	public void test10() {
		Tic tic = new Tic(3, 3);
		for(int i=0; i<3; i++){
			tic.placeX(i,0);
		}
		assertTrue(tic.fullCol(1));
	}

}
