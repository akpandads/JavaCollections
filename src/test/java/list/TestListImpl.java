package list;

import org.junit.Test;

public class TestListImpl {

    ListImpl list = new ListImpl();
    @Test
    public void testSortPersonOnAge(){

        list.sortPersonOnAge(3);
    }

    @Test
    public void testSortPersonOnName(){
        list.sortPersonOnName(3);
    }

    @Test
    public void testRemoveDuplicatesFromList(){
        list.removeDuplicatesFromList(3);
    }

    @Test
    public void  testRemoveDuplicatesBasedOnName(){
        list.removeDuplicatesBasedOnName(3);
    }
}
