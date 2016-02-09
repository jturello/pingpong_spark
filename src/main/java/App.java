import java.util.ArrayList;


public class App {

  public String numberRangeStr = "";

  private String userInputStr = "";
  private int userInputInt = 0;
  private ArrayList<Integer> numberRangeInt = new ArrayList<Integer>();
  private StringBuilder builder = new StringBuilder();


  public static void main(String[] args) {
    // App app = new App(String[0]);
  }

  // public App(String userInputStr) {
  //   userInputString = userInputStr;
  //   userInputInt = Integer.parseInt(userInputString);
  // }

  public void getNumberRange(String userInputStr) {
    // App app = new App(userInputStr);
    userInputInt = Integer.parseInt(userInputStr);

    for (int i = 0; i < userInputInt; i++) {
      if (!(i == (userInputInt - 1))){
        builder.append((i + 1) + " ");
      } else {
        builder.append(i + 1);
      }
    }

    numberRangeStr = builder.toString();
    System.out.println(numberRangeStr);
  }

}
