/**
 * Expected Output:
 * Car Year=2020, Car Model=ModelY
 */
public class Exercise12 {
    // Declare instance variables carYear and carModel
    int carYear;
    String carModel;
    // Constructor with variables carYear and carModel

    Exercise12(int newCarYear,String newCarModel){
        carYear = newCarYear;
        carModel = newCarModel;
    }

    public String toString(){
        return "Car Year= "+carYear +",Car Model= " + carModel;
    }
    public static void main(String[] args) {
        Exercise12 myCar = new Exercise12(2020, "ModelY");
        // Create an instance of class Exercise12, with carYear 2020, and carModel "ModelY"
        // print the expected output
        System.out.println(myCar);
        
    }
}
