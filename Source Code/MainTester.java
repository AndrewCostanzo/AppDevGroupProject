import org.junit.runner.*;
public class MainTester {
  public static void main(String[] args) {
    System.out.println("*** MAIN TESTER ***");
    // Obtain a system property that was set on the command line
    String opt1 = System.getProperty("optionone");
    // Set a system property here
    System.setProperty("optiontwo","secondvalue");
    String opt2 = System.getProperty("optiontwo");
    // Display the current values of the system
    // properties
    System.out.println(opt1);
    System.out.println(opt2);

    System.out.println("\n--- BEGIN TESTING ---\n");
    System.out.println("    Running Edge Connector Tester...");  
    
    JUnitCore junit = new JUnitCore();
    Result result = junit.run(CreateDDLMySQLTest.class);
    System.out.printf("Tests run: %s, Failed: %s%n",
	 result.getRunCount(), result.getFailureCount());
    
    System.out.println("    Running Edge Field Tester...");
    result = junit.run(EdgeFieldTest.class);
    System.out.printf("Tests run: %s, Failed: %s%n",
	 result.getRunCount(), result.getFailureCount());
    
    System.out.println("    Running Edge File Parser Tester...");
    result = junit.run(EdgeConvertFileParserTest.class);
    System.out.printf("Tests run: %s, Failed: %s%n",
	 result.getRunCount(), result.getFailureCount());
    
    System.out.println("    Running Edge Table Tester...");
    result = junit.run(EdgeTableTest.class);
    System.out.printf("Tests run: %s, Failed: %s%n",
	 result.getRunCount(), result.getFailureCount());

    System.out.println("\n--- FINISH TESTING ---\n");
    System.out.println("*** END OF MAIN TESTER ***");
  }
}
