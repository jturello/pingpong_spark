import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public  void getNumberRange_forUserInputs2_returnString_1_2() {
    App app = new App();
    app.getNumberRange("2");
    assertEquals("1 2", app.numberRangeStr);
  }
}
