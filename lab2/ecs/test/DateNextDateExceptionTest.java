import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateExceptionTest{

    private int year;
    private int month;
    private int day;
    private IllegalArgumentException expectedResult;

    public DateNextDateExceptionTest(int year, int month, int day, IllegalArgumentException expected){
        this.year = year;
        this.month = month;
        this.day = day;
        this.expectedResult = expected;
    }

    
    @Parameters
    public static List<Integer[]> data(){
        List<Integer[]> parameters = new LinkedList<Integer[]>();
        parameters.add(new Integer[] {4356, 13, 4});
        parameters.add(new Integer[] {400, 1, 32});
        parameters.add(new Integer[] {-1, 11, 30});
        parameters.add(new Integer[] {1, -11, 3});
        parameters.add(new Integer[] {1000, 4, -3});
        return parameters;
    }

    @Test
    public void NextDateExceptionTest(){
        Assert.assertThrows(IllegalArgumentException.class, () -> new Date(year,month,day));
    }

}