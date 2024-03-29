import java.util.ArrayList;
import java.util.Arrays;

/**
 * The converted arraylist: [JAVA, Go, JS, C, C++]
 * The converted array:
 * Python
 * PHP
 * C#
 */
public class Exercise9 {
public static void main(String[] args) {
    String[] myArray = new String[] { "JAVA", "Go", "JS", "C", "C++" };

    // 1. Convert String[] myArray to ArrayList<String> list by aslist() method
    ArrayList<String> list = new ArrayList<String>(Arrays.asList(myArray));
    System.out.println("The converted arraylist: " + list);

    // 2. Construct another ArrayList anotherList for conversion
    ArrayList<String> anotherList = new ArrayList<>();

    // and add Python, PHP, C# as list elements by add() method
    anotherList.add("Python");
    anotherList.add("PHP");
    anotherList.add("C#");
    System.out.println(anotherList);

    String[] myAnotherArray = new String[anotherList.size()];

    // Convert List to Array by toArray() method
    anotherList.toArray(myAnotherArray);
    anotherList.addAll(Arrays.asList(myAnotherArray));

    System.out.println("The converted array: " + Arrays.toString(myAnotherArray));

    // Print out the String Array by for loop
    for (String s : myAnotherArray) {
        System.out.println(s);
    }
}
}