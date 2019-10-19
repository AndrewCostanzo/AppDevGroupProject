import org.junit.Assert;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;


public class EdgeTableTest {
   private EdgeTable obj1;
   private int[] arr1, arr2, arr3;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() {
      obj1 = new EdgeTable("1|table1");
      
      for (int i = 0; i < 10; i++) {
         obj1.addRelatedTable(i);
         obj1.addNativeField(i);
      }
      
      obj1.makeArrays();
   }
   
   public void runner() { }

   /** A test that always fails. **/
   /*@Test public void defaultTest() {
      Assert.assertEquals("Default test added by jGRASP. Delete "
            + "this test once you have added your own.", 0, 1);
   }*/
   
   @Test
   public void testGetNumFigure() {
      assertTrue("numFigure is greater than 0.", obj1.getNumFigure() > 0);
   }
   
   @Test
   public void testGetName() {
      assertTrue("numFigure is not null.", obj1.getName() != null);
   }
   
   @Test
   public void testRelatedTables() {
      arr1 = obj1.getRelatedTablesArray();
      assertTrue("RelatedTables is not empty.", arr1.length > 0);
   }
   
   @Test
   public void testRelatedFields() {
      arr2 = obj1.getRelatedFieldsArray();
      assertTrue("RelatedFields is not empty.", arr2.length > 0);
   }
   
   @Test
   public void testNativeFields() {
      arr3 = obj1.getNativeFieldsArray();
      assertTrue("RelatedFields is not empty.", arr3.length > 0);
   }
   
   @Test
   public void testSetRelatedField() {
      obj1.setRelatedField(2, 5);
      arr2 = obj1.getRelatedFieldsArray();
      assertTrue("RelatedField 2 has value number \"5\".", arr2[2] == 5);
   }
   
   @Test
   public void testMoveFieldUp() {
      obj1.setRelatedField(2, 5);
      obj1.moveFieldUp(2);
      arr2 = obj1.getRelatedFieldsArray();
      assertTrue("RelatedField 1 has value number \"5\".", arr2[1] == 5);
   }
   
   @Test
   public void testMoveFieldDown() {
      obj1.setRelatedField(2, 5);
      obj1.moveFieldDown(2);
      obj1.moveFieldDown(3);
      arr2 = obj1.getRelatedFieldsArray();
      assertTrue("RelatedField 4 has value number \"5\".", arr2[4] == 5);
   }
   
   @Test
   public void testToString() {
      assertTrue("Obj1.toString() does not return an empty string ", obj1.toString() != null);
   }
   
}
