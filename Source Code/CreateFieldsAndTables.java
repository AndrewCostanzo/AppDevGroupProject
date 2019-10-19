import static org.junit.Assert.*;

public class CreateFieldsAndTables {
    
    EdgeTable et1;
    EdgeTable et2;
    EdgeTable et3;
    EdgeTable[] ets;
    
    EdgeField ef1;
    EdgeField ef2;
    EdgeField ef3;
    EdgeField ef4;
    EdgeField ef5;
    EdgeField[] efs;
    
    public CreateFieldsAndTables() {

        et1 = new EdgeTable("1|table1");
        et2 = new EdgeTable("2|table2"); 
        et3 = new EdgeTable("3|table3"); 
        
        ets = new EdgeTable[3];
        ets[0] = et1;
        ets[1] = et2;
        ets[2] = et3;

        ef1 = new EdgeField("1|oli");
        ef2 = new EdgeField("2|calvin");
        ef3 = new EdgeField("3|amanda");
        ef4 = new EdgeField("4|mcquaid");
        ef5 = new EdgeField("5|sunny");

        efs = new EdgeField[5];
        efs[0] = ef1;
        efs[1] = ef2;
        efs[2] = ef3;
        efs[3] = ef4;
        efs[4] = ef5;
        makeET1();
        makeET2();
        makeET3();
        makeEF1();
        makeEF2();
        makeEF3();
        makeEF4();
        makeEF5();
    }

    private void makeET1() {
        et1.addRelatedTable(2); 
        et1.addRelatedTable(3); 
        et1.addRelatedTable(4);
        et1.makeArrays();
        et1.addNativeField(2);
        et1.addNativeField(3);
        et1.addNativeField(4);
        et1.makeArrays();
        et1.setRelatedField(0, 0);
        et1.setRelatedField(1, 2);
    }

    private void makeET2() {
        et2.addRelatedTable(1); 
        et2.addRelatedTable(3); 
        et2.addRelatedTable(4);
        et2.makeArrays();
        et2.addNativeField(1);
        et2.addNativeField(2);
        et2.addNativeField(3);
        et2.makeArrays();
        et2.setRelatedField(0, 0);
        et2.setRelatedField(1, 0);
    }

    private void makeET3() {
        et3.addRelatedTable(1); 
        et3.addRelatedTable(2); 
        et3.addRelatedTable(4);
        et3.makeArrays();
        et3.addNativeField(1);
        et3.addNativeField(2);
        et3.addNativeField(3);
        et3.addNativeField(6);
        et3.makeArrays();
        et3.setRelatedField(0, 3);
        et3.setRelatedField(1, 4);
    }
 
    private void makeEF1() {
        ef1.setTableID(0);
        ef1.setTableBound(0);
        ef1.setFieldBound(0);
        ef1.setDataType(0);
        ef1.setVarcharValue(1);
        ef1.setDefaultValue("");
        ef1.setDisallowNull(true);
        ef1.setIsPrimaryKey(true);
    }

    private void makeEF2() {
        ef2.setTableID(1);
        ef2.setTableBound(1);
        ef2.setFieldBound(1);
        ef2.setDataType(1);
        ef2.setVarcharValue(2);
        ef2.setDefaultValue("a");
        ef2.setDisallowNull(false);
        ef2.setIsPrimaryKey(false);
    } 

    private void makeEF3() {
        ef3.setTableID(2);
        ef3.setTableBound(2);
        ef3.setFieldBound(2);
        ef3.setDataType(2);
        ef3.setVarcharValue(3);
        ef3.setDefaultValue("ab");
        ef3.setDisallowNull(true);
        ef3.setIsPrimaryKey(false);
    }

    private void makeEF4() {
        ef4.setTableID(3);
        ef4.setTableBound(3);
        ef4.setFieldBound(3);
        ef4.setDataType(1);
        ef4.setVarcharValue(4);
        ef4.setDefaultValue("abc");
        ef4.setDisallowNull(false);
        ef4.setIsPrimaryKey(false);
    }

    private void makeEF5() {
        ef5.setTableID(4);
        ef5.setTableBound(4);
        ef5.setFieldBound(4);
        ef5.setDataType(0);
        ef5.setVarcharValue(5);
        ef5.setDefaultValue("abcd");
        ef5.setDisallowNull(true);
        ef5.setIsPrimaryKey(false);
    }

    public EdgeTable[] getEdgeTables() {
        return ets;
    }

    public EdgeField[] getEdgeFields() {
        return efs;
    }
}
