public interface GeneralConnector{
   public int getNumConnector();
   public int getEndPoint1();
   public int getEndPoint2();
   public String getEndStyle1();
   public String getEndStyle2();
   public boolean getIsEP1Field();
   public boolean getIsEP2Field();
   public boolean getIsEP1Table();
   public boolean getIsEP2Table();
   public void setIsEP1Field(boolean value);
   public void setIsEP2Field(boolean value);
   public void setIsEP1Table(boolean value);
   public void setIsEP2Table(boolean value);
}