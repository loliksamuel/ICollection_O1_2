/**
 * Created by lolik on 2017-03-31.
 * a question in interview at citibank 28.3.2017
 * Describe a data structure with:
 * 1. getValue(int index),              O(1).
 * 2. setValue(int index, int value)    O(1).
 * 3. setAllValues(int value)           O(1).
 *
 * solution should be all in O(1)
 */
interface Collection_Interface {
    //public void initialize();//              O(?)
    String get(int index);              //O(1)
    void   set(int index, String value);//O(1)
    void   setAll(String value);        //O(1)
}
/**solution (there are 2 solutions in this projects
 1. Collection_1
 2. Collection_2


 Though array is good enough for the first and second operations to be performed in O(1),
 only array gives a random access
 what can be proposed for the third (setAllValues)?
 an array of tuples {timestamp, value}, with an additional {timestamp, value} called all. Since you only care about the relative time of insertions,
 you can use a monotonically increasing id for the values of timestamp. Initialise all fields to 0.
 Then the following should work for you:

 1. set(index i, value v): array[i] = {id++, value}

 2. get(index i, value v): if(all.timestamp > array[i].timestamp) return all.value
                             else return array[i].value

 3. setAll(value v): all = {id++, value}



 A problem with this approach is that eventually you'll run out of ids for timestamp, and might wrap around. If you chose a 64 bit value to store timestamps,
 then this gives you 2^64=18,446,744,073,709,551,616 insertions or setAlls before this happens. Depending on the expected use of the data structure,
 an O(n) cleanup phase might be appropriate, or you could just throw an exception.
 Another issue that might need to be considered is multi-threading. Three obvious problems:
 if id++ isn't atomic and 2 threads obtained a new id at the same time then you could get 2 entries with the same id.
 if the incrementation of id and the assignment of the created tuple aren't atomic together (they're probably not) and there were two simultaneous inserts, then you could get a race condition where the older id wins.
 if the assignment of the tuple isn't atomic, and there's an insert() at the same time as a get() then you might end up in a position where you've got say {new_id, old_value} in the array, causing the wrong value to be returned.
 If any of these are problems, the absolute easiest solution to this is to put "not thread safe" in the documentation (cheating). Alternatively, if you can't implement the methods atomically in your language of choice, you'd need to put some sort of synchronisation locks around them.
 */