
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
	@Test
	public void test11() {
		Tic board = new Tic(3,3);
		board.add(2, 1, "X");


		//Good test
		assertEquals(8, board.getAllEmpty(3,3));

	}
	@Test
void TestIsOccupiedX() {
		Tic board = new Tic(3,3);
		
		board.add(1, 2, "X");
		board.add(1, 3, "X");
			
		//Good tests		
		//found an X
		int v5 = board.isOccupiedX(1, 2);
		assertEquals(1, v5);
		
		//found an O or an empty one
		int v6 = board.isOccupiedX(1, 3);
		assertEquals(1,v6);
	}

	@Test
	void TestTrun() {
		Tic board = new Tic(3,3);
		String turnTest = board.turn;

		//Good test
		assertEquals("X",turnTest);

	}
}
