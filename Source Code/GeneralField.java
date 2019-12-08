public interface GeneralField{

   public int getNumFigure();
   public String getName();
   public int getTableID();
   public void setTableID(int value);
   public int getTableBound();
   public void setTableBound(int value);
   public int getFieldBound();
   public void setFieldBound(int value);
   public boolean getDisallowNull();
   public void setDisallowNull(boolean value);
   public boolean getIsPrimaryKey();
   public void setIsPrimaryKey(boolean value);
   public String getDefaultValue();
   public void setDefaultValue(String value);
   public int getVarcharValue();
   public void setVarcharValue(int value);
   public int getDataType();
   public void setDataType(int value);
   //public static String[] getStrDataType();
   public String toString();
}