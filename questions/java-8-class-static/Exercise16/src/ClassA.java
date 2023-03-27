import com.azul.crs.client.sysinfo.SystemInfoProvider;

public class ClassA {// Please complete ClassA.java

      // 1
      public static final int SOME_NUMBER = initSomeNum();
      public static int someOtherNumber = 99;
      // 2
      public final String someString = initSomeString();
    
      // 1.2
      // one static initialization block to print Something here
      static{
        System.out.println("[Class A] Calling private static method");
      }
    
      // 2.2
      // initialization block to print Something here
      {
        System.out.println("[Class A] Calling static initialization block");
      }
  
      // 1.1
      // one static Method initSomeNum() return int 0, print Something here
      private static int initSomeNum(){
        System.out.println("[Class A] Calling private method");
        return 0;
      }
    
      // 2.1
      // Instance Method initSomeString() return String and print something here
      private String initSomeString(){
        System.out.println("[Class A] Calling initialization block");
        return "someStingA";
      }
      // A Constructor for ClassA to print something here
      public ClassA(){
        System.out.println("Calling constructor");
      }
    
    }
    
  /*
   * ------ Output ------
   * [Class A] Beginning of object creation
   * [Class A] Calling private static method
   * [Class A] Calling static initialization block
   * [Class A] Calling private method
   * [Class A] Calling initialization block
   * [Class A] Calling constructor
   * [Class A] End of object creation
   */
  

