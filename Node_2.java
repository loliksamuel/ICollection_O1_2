/**
 * Created by lolik on 2017-03-31.
 */
class Node_2 {

    private String field1;
    private String field1_4All;//joker is the default value to support setAll in O(1)

    Node_2(String value, String aDefaultValue) {
        field1 = value;
        field1_4All = aDefaultValue;
    }

    String getField1() {
        return field1;
    }

    public void setField1(String value) {
        field1 = value;
    }

    String getField1_4All() {
        return field1_4All;
    }
}
