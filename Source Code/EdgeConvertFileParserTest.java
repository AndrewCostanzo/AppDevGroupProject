import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import java.io.*;


public class EdgeConvertFileParserTest {
   EdgeConvertFileParser testObj;
   File testFile;

   /** Fixture initialization (common initialization
    *  for all tests). **/
   @Before public void setUp() throws Exception{
      testFile = new File("Courses.edg");
      testObj = new EdgeConvertFileParser(testFile);
   }

   @Test
   public void parseEdgeFileDoesntError(){
      try{
         testObj.parseEdgeFile();
         assertTrue("Parse Edge File method doesn't throw error", 1 == 1);
      }catch(Exception e){
         assertFalse("Parse Edge File method does throw error", 0 == 0);
      }
   }
   
   @Test
   public void parseSaveFileDoesntError(){
      try{
         testObj.parseSaveFile();
         assertTrue("Parse Save File method doesn't throw an error", 1 == 1);
      }catch(Exception e){
         assertFalse("Parse Save File method does throw an error", 0 == 0);
      }
   }
   
   
   @Test
   public void openFileDoesntError(){
      try{
         testObj.openFile(testFile);
         assertTrue("Open File method doesn't throw an error", 1 == 1);
      }catch(Exception e){
         assertFalse("Open File method does throw an error", 0 == 0);
      }
   }
   
   @Test
   public void isGetEdgeTablesPopulated(){
      EdgeTable[] table = testObj.getEdgeTables();
      assertTrue("Edge Table is not empty", table.length > 0);
   }
   
   @Test
   public void isGetEdgeFieldsPopulated(){
      EdgeField[] fields = testObj.getEdgeFields();
      assertTrue("Edge Fields is not empty", fields.length > 0);
   }
}
