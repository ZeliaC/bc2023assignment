import java.util.jar.Attributes.Name;

/**
 * Expected Output:
 * J
 * e
 * 3
 * 9
 * 10
 * ab c
 * VenturenixLAB, Coding
 * 19
 * ren
 * VENTURENIXLAB, JAVA
 * venturenixlab, java
 * V*NTUR*NIXLAB, JAVA!!!
 */
public class Exercise2 {
  public static void main(String[] args) {
    String str = "VenturenixLAB, Java";
    String name = "VenturenixLAB, Java";
    // Use int name.charAt()
    System.out.println(name.charAt(15));//print J
    System.out.println(name.charAt(1));//prints e

    // Use int indexOf(int ch), or int indexOf(String ch)
    System.out.println(name.indexOf("t"));//Prints 3
    System.out.println(name.indexOf("x"));//Prints 9
    System.out.println(name.indexOf("L"));//prints 10

    // Use String trim()
    String abc = "    ab c    ";
    System.out.println(abc.trim());// prints "ab c"
    // Use String replace() method
    System.out.println(name.replaceAll( "Java", "Coding"));//ptints VenturenixLAB, Coding

    // int length()
    System.out.println(name.length());//prints 19

    //Use String substring(int start, int end)
    System.out.println(name.substring( 5, 8));// prints "ren "

    // String to LowerCase(), and String toUpperCase()
    System.out.println(name.toUpperCase());//print "VENTU,JAVA"
    System.out.println(name.toLowerCase());//print "ventu, jave"

    //Method Chaining, replaceAll(),toUpperCase(), concat()
    System.out.println(name.replaceAll("e", "*").toUpperCase().concat("!!!"));

  }

}