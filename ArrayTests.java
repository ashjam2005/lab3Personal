import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAnotherTypeOfReverse()
  {
    
    int[] input1 = {23,34,45,67};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{67,45,34,23},input1);
  }

  @Test
  public void testSecondTypeOfReverse()
  {
    int[] input1 = {23,34,45};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{45,34,23},input1);
  }
}
