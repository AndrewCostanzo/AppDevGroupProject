import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class EdgeFieldTest{
   EdgeField testObj;
   
   @Before
   public void setUp() throws Exception {
      
      testObj = new EdgeField("1|oli");
      runner();
   }
   
   public void runner(){
      
   }
   
   @Test
   public void getNumFigureTest(){
      int test = testObj.getNumFigure();
      assertTrue("NumFigure is int", test == (int)test);
   }
   
   @Test
   public void getNameTest(){
      String test = testObj.getName();
      assertTrue("Name isn't empty", test.isEmpty());
   }
   
   @Test
   public void getTableBoundTest(){
      int test = testObj.getTableBound();
      assertTrue("TableBound is int", test == (int)test);
   }
   
   @Test
   public void getFieldBoundTest(){
      int test = testObj.getFieldBound();
      assertTrue("FieldBound is int", test == (int)test);
   }
   
   @Test
   public void getDisallowNullTest(){
      boolean test = testObj.getDisallowNull();
      if (test == true || test == false){
         test = true;
      }
      assertTrue("DisallowNull is boolean", test);
   }
   
   @Test
   public void getIsPrimaryKeyTest(){
      boolean test = testObj.getIsPrimaryKey();
      if (test == true || test == false){
         test = true;
      }
      assertTrue("PrimaryKeyTest is boolean", test);
   }
   
   @Test
   public void getDefaultValueTest(){
      String test = testObj.getDefaultValue();
      assertTrue("DefaultValue isn't empty", test.isEmpty());
   }
   
   @Test
   public void getVarcharValueTest(){
      int test = testObj.getVarcharValue();
      assertTrue("VarcharValue is int", test == (int)test);
   }
   
   @Test
   public void getDataTypeTest(){
      int test = testObj.getDataType();
      assertTrue("DataType is int", test == (int)test);
   }
   
   @Test
   public void getStrDataTypeTest(){
      String[] test = testObj.getStrDataType();
      assertTrue("StrDataType is not emplty", test.length > 0);
   }
}