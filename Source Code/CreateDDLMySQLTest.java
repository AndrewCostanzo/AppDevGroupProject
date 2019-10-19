import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CreateDDLMySQLTest{
   CreateDDLMySQL testObj;
   CreateFieldsAndTables testObj2;
   String dbName;
   
   @Before
   public void setUp() throws Exception {
      
      testObj2 = new CreateFieldsAndTables();
      testObj = new CreateDDLMySQL(testObj2.getEdgeTables(), testObj2.getEdgeFields());
      runner();
   }

   public void runner(){
   }
   
   
   @Test
   public void nonEmptyEdgeTables(){
      EdgeTable[] table = testObj2.getEdgeTables();
      assertTrue("Edge Table is not empty", table.length > 0);
   }
   
   @Test
   public void nonEmptyEdgeFields(){
      EdgeField[] fields = testObj2.getEdgeFields();
      assertTrue("Edge Fields is not empty", fields.length > 0);
   }
   
   @Test
   public void nonEmptyDBName(){
      dbName = testObj.generateDatabaseName();
      assertTrue("DB Name is not empty", dbName.length() > 0);
   }
   
   @Test
   public void DBNameEntered(){
      String checkName = testObj.getDatabaseName();
      assertTrue("Entered name and DB name are the same", dbName == checkName);
   }
   
   @Test
   public void testProductName(){
      String productName = testObj.getProductName();
      assertTrue("Product name == MySQL", productName == "MySQL");
   }
   
   @Test
   public void testTrueStrBool(){
      //should return a 1
      int det = testObj.convertStrBooleanToInt("true");
      assertTrue("When passed true, method returns a 1", det == 1);
   }
   
   @Test
   public void testFalseStrBool(){
      int det = testObj.convertStrBooleanToInt("false");
      assertTrue("When passed false, method returns a 0", det == 0);
   }
   
   @Test
   public void testRandomInputStrBool(){
      int det = testObj.convertStrBooleanToInt("Random test 0696969");
      assertTrue("When passed random value, method returns a 0", det == 0);
   }
   
   @Test
   public void testToString(){
      String toString = testObj.toString();
      assertTrue("DDL toString is not empty", toString.length() > 0);
   }
   
   @Test
   public void createDDLDoesntError(){
      try{
         testObj.createDDL();
         assertTrue("Create DDL method doesn't throw error", 1 == 1);
      }catch(Exception e){
         assertFalse("Create DDL method does throw error", 0 == 0);
      }
   }
   
}
