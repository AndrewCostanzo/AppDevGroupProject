public interface GeneralTable{

   public int getNumFigure();
   public String getName();
   public void addRelatedTable(int relatedTable);
   public int[] getRelatedTablesArray();
   public int[] getRelatedFieldsArray();
   public void setRelatedField(int index, int relatedValue);
   public int[] getNativeFieldsArray();
   public void addNativeField(int value);
   public void moveFieldUp(int index);
   public void moveFieldDown(int index);
   public void makeArrays();
   public String toString();
}