import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DateTest {

  @Test
  void nextDate_0() {
    Date d = new Date(2020,5,3);
    assertEquals(new Date(2020,5,4), d.nextDate());
  }

  @Test
  void nextDate_1() {
    Date d = new Date(1700,06,20);
    assertEquals(new Date(1700,06,21), d.nextDate());
  }

  @Test
  void nextDate_2() {
    Date d = new Date(2005,04,15);
    assertEquals(new Date(2005,04,16), d.nextDate());
  }

  @Test
  void nextDate_3() {
    Date d = new Date(1901,07,20);
    assertEquals(new Date(1901,07,21), d.nextDate());
  }

  @Test
  void nextDate_4() {
    Date d = new Date(3456,03,27);
    assertEquals(new Date(3456,03,28), d.nextDate());
  }

  @Test
  void nextDate_5() {
    Date d = new Date(1500,02,17);
    assertEquals(new Date(1500,02,18), d.nextDate());
  }

  @Test
  void nextDate_6() {
    Date d = new Date(1700,06,29);
    assertEquals(new Date(1700,06,30), d.nextDate());
  }

  @Test
  void nextDate_7() {
    Date d = new Date(1800,11,29);
    assertEquals(new Date(1800,11,30), d.nextDate());
  }

  @Test
  void nextDate_8() {
    Date d = new Date(3453,01,29);
    assertEquals(new Date(3453,01,30), d.nextDate());
  }

  @Test
  void nextDate_9() {
    Date d = new Date(444,02,29);
    assertEquals(new Date(444,03,01), d.nextDate());
  }

  @Test
  void nextDate_10() {
    Date d = new Date(2005,04,30);
    assertEquals(new Date(2005,05,01), d.nextDate());
  }

  @Test
  void nextDate_11() {
    Date d = new Date(3453,01,30);
    assertEquals(new Date(3453,01,31), d.nextDate());
  }

  @Test
  void nextDate_12() {
    Date d = new Date(3456,03,30);
    assertEquals(new Date(3456,03,31), d.nextDate());
  }  @Test
  void nextDate_13() {
     Date d = new Date(1901,7,31);
     assertEquals(new Date(1901,8,1), d.nextDate());
  }  @Test
  void nextDate_14() {
    Date d = new Date(3453,01,31);
    assertEquals(new Date(3453,02,01), d.nextDate());
  } void nextDate_15() {
    Date d = new Date(3456,12,31);
    assertEquals(new Date(3457,01,01), d.nextDate());
  }

  @Test
  void nextDate_fail16() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(1500,02,31)
    );
  }

  @Test
  void nextDate_fail17() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(1500,02,29)
    );
  }

  @Test
  void nextDate_fail18() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(-1,10,20)
    );
  }

  @Test
  void nextDate_fail19() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(1458,15,12)
    );
  }

  @Test
  void nextDate_fail20() {
    assertThrows(
            IllegalArgumentException.class,
            () -> new Date(1975,6,-50)
    );
  }
}