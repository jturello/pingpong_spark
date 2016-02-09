import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void getNumberRange_forUserEnters2_returnString_1_2() {
    App app = new App();
    app.getNumberRange("2");
    assertEquals("1 2", app.numberRangeStr);
  }

  @Test
  public void getNumberRange_forUserEnters3_returnString_1_2_ping() {
    App app = new App();
    app.getNumberRange("3");
    assertEquals("1 2 ping", app.numberRangeStr);
  }

  @Test
  public void getNumberRange_forUserEnters5_returnString_1_2_ping_4_pong() {
    App app = new App();
    app.getNumberRange("5");
    assertEquals("1 2 ping 4 pong", app.numberRangeStr);
  }

  @Test
  public void getNumberRange_forUserEnters15_returnString_1_2_ping_4_pong_ping_7_8_ping_pong_11_ping_13_14_pingpong() {
    App app = new App();
    app.getNumberRange("15");
    assertEquals("1 2 ping 4 pong ping 7 8 ping pong 11 ping 13 14 pingpong", app.numberRangeStr);
  }
}
