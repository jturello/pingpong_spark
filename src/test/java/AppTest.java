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
}
