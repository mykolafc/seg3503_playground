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
    private IllegalArgumentException expectedresult;

    public DateNextDateExceptionTest(int year, int month, int day, IllegalArgumentException expected){
        this.year = year;
        this.month = month;
        this.day = day;
        this.expectedresult = expected;
    }

    
    @Parameters
    public static List<Object[]> data(){
        List<Object[]> parameters = new LinkedList<Object[]>();
        parameters.add(new Object[] {4356, 13, 4, new IllegalArgumentException("month must be between 1 and 12.")});
        parameters.add(new Object[] {400, 1, 32, new IllegalArgumentException("day cannot be greater than 31.")});
        parameters.add(new Object[] {-1, 11, 30, new IllegalArgumentException("year must be greater than or equal to 0.")});
        parameters.add(new Object[] {1, 2, 30, new IllegalArgumentException("day must be less than 29 for month February on a non leap year.")});
        parameters.add(new Object[] {1000, 4, -3, new IllegalArgumentException("day must be greater or equal to 1.")});
        return parameters;
    }

    @Test
    public void NextDateExceptionTest(){
        Assert.assertThrows(IllegalArgumentException.class, () -> new Date(year,month,day));
    }

}