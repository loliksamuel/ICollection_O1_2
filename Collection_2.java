/**
 * Created by lolik on 2017-03-31.
 */
class Collection_2 implements Collection_Interface {

    private  Node_2[] arr;

    private boolean defaultValueChanged;
    private String defaultValue;

    Collection_2(int len) {
        arr = new Node_2[len];
//        for (int i = 0;i<len; i++)
//            arr[i] = new Node_1(0, null);
    }

    public void set(int i, String value) {
        defaultValueChanged = false;
        arr[i] = new Node_2(value, defaultValue);

    }

    public void setAll(String value) {
        defaultValueChanged = true;
        defaultValue = value;
    }

    public String get(int i) {

        String result;

        if (i > arr.length ) {
            return null;
        }

        // setAll() has been just called
        if (defaultValueChanged) {
            return defaultValue;
        }
        //return arr[i].getField1();
        if (arr[i] == null) {

            // setAll() has been previously called
            if (defaultValue != null) {
                result = defaultValue;
            } else {
                result = null;

            }

        } else if (arr[i].getField1_4All()== this.defaultValue) {
            // cell value has been overridden after setAll() call
            result = arr[i].getField1();
        } else {
            result = defaultValue;
        }

        return result;
    }


}
