/**
 * Created by lolik on 2017-03-31.
 */
class Main {

    public static void main(String[] args) {

        Collection_1 ds = new Collection_1(100);

        String res;

        res = ds.get(3);

        ds.set(3, "value");

        res = ds.get(3);

        ds.setAll("sameValueForAll");

        res = ds.get(3);

        res = ds.get(15);

        ds.set(4, "value4");

        res = ds.get(4);

        res = ds.get(3);

        ds.setAll("sameValueForAll");

        ds.set(8, "value");

        res = ds.get(3);

        System.out.println("succeeded creating a collection that supports get(), set(), setAll() in O(1)");
        System.out.println("initialize() in O(1)");
    }
}
