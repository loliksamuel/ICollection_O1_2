import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by lolik on 2017-03-31.
 */

public class UnitTest_1 {

    String res;
    @BeforeClass
    public static  void init()
    {

    }

    @Test
    public void assertGetAfterInitialise()
    {

        Collection_1 ds = new Collection_1(100);
        res = ds.get(3);
        assertEquals(null, res);
   }

    @Test
    public void assertGetAfterSet()
    {

        Collection_1 ds = new Collection_1(100);
        ds.set(3, "value");
        res = ds.get(3);
        assertEquals("value", res);

    }
    @Test
    public void assertGetAfterSet2()
    {

        Collection_1 ds = new Collection_1(100);
        ds.set(3, "value");
        res = ds.get(4);
        assertEquals(null, res);

    }
    @Test
    public void assertGetAfterSetAll()
    {

        Collection_1 ds = new Collection_1(100);
        ds.setAll("sameValueForAll");
        res = ds.get(3);
        assertEquals("sameValueForAll", res);
        res = ds.get(15);
        assertEquals("sameValueForAll", res);

    }

    @Test
    public void assertGetAfterSetAfterSetAll()
    {

        Collection_1 ds = new Collection_1(100);
        ds.setAll("sameValueForAll");
        ds.set(2, "value");
        res = ds.get(2);
        assertEquals("value", res);


    }

    @Test
    public void assertGetAfterSetAfterSetAll2()
    {
        Collection_1 ds = new Collection_1(100);
        ds.setAll("sameValueForAll");
        ds.set(2, "value");
        res = ds.get(3);
        assertEquals("sameValueForAll", res);
    }


    @Test
    public void assertGetAfterSetAfterSetAllAfterSet()
    {
        Collection_1 ds = new Collection_1(100);
        ds.set(1, "value1");
        ds.setAll("sameValueForAll");
        ds.set(2, "value2");
        res = ds.get(1);
        assertEquals("sameValueForAll", res);
    }

    @Test
    public void assertGetAfterSetAfterSetAllAfterSet2()
    {
        Collection_1 ds = new Collection_1(100);
        ds.set(1, "value1");
        ds.set(1, "value11");
        ds.setAll("sameValueForAll");
        ds.set(2, "value2");
        res = ds.get(1);
        assertEquals("sameValueForAll", res);
    }

    @Test
    public void assertGetAfterSetAfterSetAllAfterSet3()
    {
        Collection_1 ds = new Collection_1(100);
        ds.set(1, "value1");
        ds.setAll("sameValueForAll");
        ds.set(2, "value2");
        ds.set(3, "value3");
        res = ds.get(1);
        assertEquals("sameValueForAll", res);
    }
}
