import java.util.ArrayList;
import java.util.Arrays;

import javax.security.auth.kerberos.KerberosCredMessage;

/**
 * The sum is 55
 */
public class Exercise7 {
  // Sum values of an array
  public static void main(String[] args) {
    // Declare a int array, with value 1 to 10
    // code here

    int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
    System.out.println(Arrays.toString(arr));

    //int sum = 0;
    int sum = 0;
    for (int k =0;k < arr.length; k++){
      sum += arr[k];}
      System.out.println(" The sum is " + sum);
    // Write a loop to sum up all value in the int array, the result should be 55
    // code here
    //System.out.println("The sum is " + sum);
  }
}
