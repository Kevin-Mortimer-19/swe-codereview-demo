/**
 * 
 * Implement Fizz Buzz Game with TDD
 * 
 * Players generally sit in a circle. The player designated to go first says the number "1",
 * and each player thenceforth counts one number in turn.
 * However, any number divisible by three is replaced by the word fizz and any number divisible by five by the word buzz.
 * Numbers divisible by 15 become fizz buzz.
 * A player who hesitates or makes a mistake is eliminated from the game.
 *
 * For example, a typical round of fizz buzz would start as follows:
 * 1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, Fizz Buzz, 
 * 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, Fizz Buzz, 
 * 31, 32, Fizz, 34, Buzz, Fizz, ...
 *
 * @author Kevin Mortimer, Calvin Vuong
 */

public class Main { 
    
    /**
	 * Process a number
	 * @param num a number
	 * @return a string corresponds to that number
	 */
	public static String processNumber(int num) {
        if (num%3 == 0 && num%5 == 0){
          return "Fizz Buzz";
        } else if (num%3 == 0) {
          return "Fizz";
        } else if (num%5 == 0) {
          return "Buzz";
        } else
          return ""+num;
    }
    
    /**
	 * Process numbers
	 * @param nums an array of numbers
	 * @return a string corresponds to that numbers array
	 */
	public static String processNumbers(int[] nums) {
        int length = nums.length;
        String result = "";
        for(int i = 0; i < length-1; i++){
          result += (String) processNumber(nums[i]) + ", ";
        }
        return result + (String) processNumber(nums[length-1]);
    }
    
    /**
	 * Test processNumber
	 */
    private static void testProcessNumber() {
      System.out.println("Running processNumber test cases");
      assertEquals(processNumber(1), "1");
      assertEquals(processNumber(3), "Fizz");
      assertEquals(processNumber(5), "Buzz");
      assertEquals(processNumber(15), "Fizz Buzz");
      assertEquals(processNumber(297), "Fizz");
      assertEquals(processNumber(545), "Buzz");
      assertEquals(processNumber(330), "Fizz Buzz");
      assertEquals(processNumber(298), "298");
      assertEquals(processNumber(0), "Fizz Buzz");
      assertEquals(processNumber(-0), "Fizz Buzz");
    }
    
    /**
	 * Test processNumbers
	 */
    private static void testProcessNumbers() {
        System.out.println("Running processNumbers test cases");
        // TODO: Write test cases for processNumbers here using assertEquals
        // E.g., assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {1}), "1");
      assertEquals(processNumbers(new int[] {3}), "Fizz");
      assertEquals(processNumbers(new int[] {5}), "Buzz");
      assertEquals(processNumbers(new int[] {15}), "Fizz Buzz");
      assertEquals(processNumbers(new int[] {297}), "Fizz");
      assertEquals(processNumbers(new int[] {545}), "Buzz");
      assertEquals(processNumbers(new int[] {330}), "Fizz Buzz");
      assertEquals(processNumbers(new int[] {298}), "298");
      assertEquals(processNumbers(new int[] {1, 2, 3}), "1, 2, Fizz");
      assertEquals(processNumbers(new int[] {3, 4, 5}), "Fizz, 4, Buzz");
      assertEquals(processNumbers(new int[] {13, 14, 15}), "13, 14, Fizz Buzz");
      assertEquals(processNumbers(new int[] {297, 330, 545}), "Fizz, Fizz Buzz, Buzz");
      assertEquals(processNumbers(new int[] {-1}), "-1");
      assertEquals(processNumbers(new int[] {-3}), "Fizz");
      assertEquals(processNumbers(new int[] {-5}), "Buzz");
      assertEquals(processNumbers(new int[] {-15}), "Fizz Buzz");
      assertEquals(processNumbers(new int[] {-297}), "Fizz");
      assertEquals(processNumbers(new int[] {-545}), "Buzz");
      assertEquals(processNumbers(new int[] {-330}), "Fizz Buzz");
      assertEquals(processNumbers(new int[] {-298}), "-298");
      assertEquals(processNumbers(new int[] {-1, -2, -3}), "-1, -2, Fizz");
      assertEquals(processNumbers(new int[] {-3, -4, -5}), "Fizz, -4, Buzz");
      assertEquals(processNumbers(new int[] {-13, -14, -15}), "-13, -14, Fizz Buzz");
      assertEquals(processNumbers(new int[] {-297, -330, -545}), "Fizz, Fizz Buzz, Buzz");
      
      
      
    }

    /**
	 * Implement assertEquals, print out Pass if actual string equals to expected; fail otherwise
	 * @param actual actual string
	 * @param expected expected string     
	 */
    private static void assertEquals(String actual, String expected) {
        if (actual.equals(expected)) {
            System.out.println("Pass");
        }
        else {
            System.out.println(String.format("Fail: expected: %s, actual: %s", expected, actual));
        }
    }
    
    public static void main(String[] args) {
        testProcessNumber();
        testProcessNumbers();
    }
}