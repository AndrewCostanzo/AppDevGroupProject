import java.io.*;
import java.util.*;
public abstract class GeneralFileParser{
   
   protected File parseFile;
   protected FileReader fr;
   protected BufferedReader br;
   protected String currentLine;
   protected ArrayList alTables, alFields, alConnectors;
   protected GeneralTable[] tables;
   protected GeneralField[] fields;
   protected GeneralField tempField;
   protected GeneralConnector[] connectors;
   protected String style;
   protected String text;
   protected String tableName;
   protected String fieldName;
   protected boolean isEntity, isAttribute, isUnderlined = false;
   protected int numFigure, numConnector, numFields, numTables, numNativeRelatedFields;
   protected int endPoint1, endPoint2;
   protected int numLine;

   public abstract void resolveConnectors();
   public abstract void parseSaveFile() throws IOException;
   public abstract void makeArrays();
   public abstract boolean isTableDup(String testTableName);
   public abstract void openFile(File inputfile);
   
}