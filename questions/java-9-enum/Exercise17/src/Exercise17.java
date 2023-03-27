enum Level {
    LOW(1),
    MEDIUM(2),
    HIGH(3);

    private int value;

    private Level(int value) {
        this.value = value;
    }

    public int getValue(){
        return this.value;

    }
}
/**
 * Expected Output:
 * This is Medium level
 * enum is MEDIUM, and its value is 2
 */
public class Exercise17 {
    public static void main(String[] args) {
        Level myVar = Level.MEDIUM; 

        switch (myVar) {
            case LOW:
            System.out.println("This is Low level");
            break;
            case MEDIUM:
            System.out.println("This is Medium level");
            System.out.println("enum is Medium,and its Value is " + myVar.getValue());
            break;
            case HIGH:
            System.out.println("This is Hugh level");
            break;         
        }
        // Write a switch statement to print the expected output.
    }
}