import javax.security.auth.x500.X500Principal;

public class Exercise4 {
  /**
   * Exercise: Print first 10 natural numbers, but skip 6
   */
  /**
   * Expected Output:
   * The first 10 natural numbers are, except 6:
   * 1234578910
   */
  /**
   * public static void main(String[] args) {
   * for (int i =1; i<= 10;i ++){
   * if (i ==6 ){
   * continue;
   * }
   * System.out.print( i+" ");
   * 
   * }
   * }
   * }%
   */
  public static void main(String[] args) {

    /**
     * for(int i =1;i<10;i++);{
     * System.out.println( "Count is:"+(i++) );
     * }
     */

    int[] arr = { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
    
      for (int i = 0; i < arr.length; i++) {

      System.out.print(arr[i] + " ");
    }

  }
}

// Write a For Loop, skip 6 by if statement
