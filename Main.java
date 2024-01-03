// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

class Main {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("song 1");
    list.add("song 2");
    list.add("song 3");

    list.add("movie 1");
    list.add("movie 2");
    list.add("movie 3");

    list.add("book 1");
    list.add("book 2");
    list.add("book 3");

    list.remove(8);

    for (String s : list) {
      System.out.println(s);
    }

    // System.out.println("display all elements:");
    // for(int temperature : temperatures){
    // System.out.println(temperature);

  }
}

// @Test
// void addition() {
// assertEquals(2, 1 + 1);
// }
