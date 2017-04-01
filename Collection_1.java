/**
 * Created by lolik on 2017-03-31.
 */
class Collection_1 implements Collection_Interface {

    private Node_1[] arr;
    //to support setAll() in O(1) added 2 params
    private static String field1_4All;
    private static int version1_4All;

    Collection_1(int len) {
        arr = new Node_1[len];
        for (int i = 0; i < len; i++)
            arr[i] = null;//new Node_1(null);
        version1_4All = 0;
        field1_4All = null;
    }

    public void set(int i, String value) {
        if (arr[i] == null)
            arr[i] = new Node_1(value);
        else
            arr[i].setField1(value);
        int ver = Math.max(arr[i].getVersion1(), version1_4All) + 1;
        arr[i].setVersion1(ver);
        version1_4All = ver;
        //arr[i].getField1versionMap().put(Integer.valueOf( arr[i].getVersion1()+1), val);
    }

    public void setAll(String value) {
        field1_4All = value;
        version1_4All++;
    }

    public String get(int i) {
        if (field1_4All == null)
            return (arr[i] == null) ? null : arr[i].getField1();
        if (arr[i] == null)
            return field1_4All;
        if (arr[i].getVersion1() >= version1_4All)
            return (arr[i] == null) ? null : arr[i].getField1();
        else
            return field1_4All;
    }
}
