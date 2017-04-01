/**
 * Created by lolik on 2017-03-31.
 */
class Node_1 {

    private String field1;
    private int version1;
   //private Map<Integer, String> field1versionMap
    // = new HashMap();//hashmap will not help here

    Node_1(String value) {
        setField1(value);
    }

    String getField1() {  return field1; }

    void setField1(String value) {  field1 = value; }

    int getVersion1() {
        return version1;
    }

    void setVersion1(int aVersion) {
        version1 = aVersion;
    }
}
