/**
 * Expected Output: 8
 */
public class Exercise10 {
    int x; // Create an instance attribute

    // Create a class constructor for the Main class
    public Exercise10(int x) {
        this.x = x;
        // Set the value for the instance attribute x to expected output
    }

    public static void main(String[] args) throws Exception {
        // Create an instance of this class Exercise10
        Exercise10 exercise = new Exercise10(8);
        System.out.println(" Expected Output: " + exercise.x);
        

        // Print the value of instance attribute
    }
}
