import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public  void setNumberRange_forUserInputs2_returnString_1_2() {
    App app = new App();
    assertEquals("1 2", app.numberRange);
  }
}
