import java.util.Scanner;

/*
Expected Output: (When input = 4)
   *
  ***
 *****
*******
 *****
  ***
   *
Expected Output: (When input = 7)
      *
     ***
    *****
   *******
  *********
 ***********
*************
 ***********
  *********
   *******
    *****
     ***
      *
 */
/*for (int i =1; i<= 10;i ++){
  * if (i ==6 ){
  * continue;
  * }
  * System.out.print( i+" ");*/
public class Exercise6 {

  public static void main(String[] args) {
    int i, j, r;
    
    System.out.print("Input number of rows (half of the diamond) : ");
    Scanner in = new Scanner(System.in);
    r = in.nextInt();
    for (i = 0; i < 5; i++) { // rows
      // print space
      for (j = 4 - i; j > 0; j--) {
        System.out.print(" ");
      }
      // print *
      for (j = i; j >= 0; j--) {
        System.out.print("*");
      }
      System.out.println("");
    }

    // Upper Part: increasing parttern
    // Think about how to print " " and "*"
    // and when to new line

    // Lower Part: decreasing parttern
    // Think about how to print " " and "*"
    // and when to new line

  }
}
