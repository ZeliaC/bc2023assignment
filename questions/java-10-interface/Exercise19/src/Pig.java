public class Pig implements Animal{

  @Override
  public void sound(){
    System.out.println("Wee Wee");
  }

  @Override
  public void sleep(){
    System.out.println("Zzz Zzz");
  }
/**
 * Expected Output:
 * Wee Wee
 * Zzz Zzz
 * Meow Meow
 * Zzz
 */
}

