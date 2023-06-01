import static org.junit.jupiter.api.Assertions.*;

import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_tc01() {
    Date today = new Date(1700, 6, 20);
    Date expectedTomorrow = new Date(1700, 6, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc02() {
    Date today = new Date(2005, 4, 15);
    Date expectedTomorrow = new Date(2005, 4, 16);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc03() {
    Date today = new Date(1901, 7, 20);
    Date expectedTomorrow = new Date(1901, 7, 21);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc04() {
    Date today = new Date(3456, 3, 27);
    Date expectedTomorrow = new Date(3456, 3, 28);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc05() {
    Date today = new Date(1500, 2, 17);
    Date expectedTomorrow = new Date(1500, 2, 18);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc06() {
    Date today = new Date(1700, 6, 29);
    Date expectedTomorrow = new Date(1700, 6, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc07() {
    Date today = new Date(1800, 11, 29);
    Date expectedTomorrow = new Date(1800, 11, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc08() {
    Date today = new Date(3453, 1, 29);
    Date expectedTomorrow = new Date(3453, 1, 30);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc09() {
    Date today = new Date(444, 2, 29);
    Date expectedTomorrow = new Date(444, 3, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc10() {
    Date today = new Date(2005, 4, 30);
    Date expectedTomorrow = new Date(2005, 5, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc11() {
    Date today = new Date(3453, 1, 30);
    Date expectedTomorrow = new Date(3453, 1, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc12() {
    Date today = new Date(3456, 3, 30);
    Date expectedTomorrow = new Date(3456, 3, 31);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc13() {
    Date today = new Date(1901, 7, 31);
    Date expectedTomorrow = new Date(1901, 8, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc14() {
    Date today = new Date(3453, 1, 31);
    Date expectedTomorrow = new Date(3453, 2, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_tc15() {
    Date today = new Date(3456, 12, 31);
    Date expectedTomorrow = new Date(3457, 1, 1);
    assertEquals(expectedTomorrow, today.nextDate());
  }

  @Test
  void nextDate_invalid_tc16() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 31)
    );
  }

  @Test
  void nextDate_invalid_tc17() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1500, 2, 29)
    );
  }

  @Test
  void nextDate_invalid_tc18() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(-1, 10, 20)
    );
  }

  @Test
  void nextDate_invalid_tc19() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1458, 15, 12)
    );
  }

  @Test
  void nextDate_invalid_tc20() {
    assertThrows(
      IllegalArgumentException.class,
      () -> new Date(1975, 6, -50)
    );
  }

  @Test
  void toString_invalid_tc21() { //toString 
    Date date = new Date(2003, 07 , 07);
    assertEquals("2003/July/07", date.toString());
  }

  @Test
  void isLeapYear_tc22() {
    Date today = new Date(2012, 2, 28);
    assertEquals(today.isLeapYear(), true);
  }

  @Test
  void isLeapYear_invalid_tc23() {
    Date today = new Date(2013, 7, 7);
    assertEquals(today.isLeapYear(), false);
  }

  @Test
  void isLeapYear_tc24() {
    Date today = new Date(2013, 7, 7);
    assertEquals(today.isLeapYear(), false);
  }

  @Test
  void isEquals_tc25() {//different
    Date today = new Date(2013, 7, 7);
    Date other=new Date(2013, 7, 8);
    assertEquals(today.equals(other), false);
  }
  
  @Test
  void isEquals_tc26() {//same
    Date today = new Date(2013, 7, 7);
    Date other=new Date(2013, 7, 7);
    assertEquals(today.equals(other), true);
  }
  @Test
  void isEquals_tc27() {//one invalid
    Date today = new Date(2013, 7, 7);
    Object invalid= new Object();
    assertEquals(today.equals(invalid),false);
  }

  @Test
  void isEquals_tc28() {//both invalid 
    Object invalid1=new Object();
    Object invalid2=new Object();
    assertEquals(invalid1.equals(invalid2), false);
  }

  @Test
  void isEquals_tc29() {//differnet year
    Date today = new Date(2013, 7, 7);
    Date other=new Date(2014, 7, 7);
    assertEquals(today.equals(other), false);
  }
  @Test
  void isEquals_tc30() {//differnet month
    Date today = new Date(2013, 7, 7);
    Date other=new Date(2013, 8, 7);
    assertEquals(today.equals(other), false);
  }
  @Test
  void isEquals_tc31() {//differnet day
    Date today = new Date(2013, 7, 7);
    Date other=new Date(2013, 7, 8);
    assertEquals(today.equals(other), false);
  }


}