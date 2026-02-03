import org.junit.*;
import org.junit.Assert;

public class SecondLargestTest{
    SecondLargest sl = new SecondLargest();
    @Test
    
   public void testSecondLargest(){
        int [] arr={10,25,5,40,30};
        int result = SecondLargest.findSecondLargest(arr);

          Assert.assertEquals(30,result);

    }
}