import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.*;

public class TestListExamples {
  // Write your grading tests here!
  @Test
    public void testFilter() {

      //Implementing StringChecker to pass through
      StringChecker sc = new StringChecker() {
        public boolean checkString(String s){
          if(s.contains("b")) {
            return true;
          }
            return false;
        }
    };
      
      List<String>inputList = new ArrayList<>();
      inputList.add("banana");  
      inputList.add("bandana");
      inputList.add("bandaid");
      inputList.add("crash");

      List<String>checkExpected = new ArrayList<>();
      checkExpected.add("banana");
      checkExpected.add("bandana");
      checkExpected.add("bandaid");

      

      assertEquals(checkExpected, ListExamples.filter(inputList, sc));

  }

  @Test
  public void testMerge(){
      List<String>firstArray = new ArrayList<>();
      firstArray.add("apple");
      firstArray.add("banana");
      firstArray.add("crab");
      firstArray.add("error");

      List<String>secondArray = new ArrayList<>();
      secondArray.add("atlanta");
      secondArray.add("ball");
      secondArray.add("crab");
      secondArray.add("dream");

      List<String>finalArray = new ArrayList<>();
      finalArray.add("apple");
      finalArray.add("atlanta");
      finalArray.add("ball");
      finalArray.add("banana");
      finalArray.add("crab");
      finalArray.add("crab");
      finalArray.add("dream");
      finalArray.add("error");

      assertEquals(finalArray, ListExamples.merge(firstArray, secondArray));
  }
}
