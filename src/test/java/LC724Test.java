import static org.junit.Assert.*;

public class LC724Test {

    @org.junit.Test
    public void findPivot() {

       int actual1 = LC724.findPivot(new int[] {1,7,3,6,5,6});
       int actual2 = LC724.findPivot(new int[] {1,2,3});
       int actual3 = LC724.findPivot(new int[] {2,1,-1});
       int actual4 = LC724.findPivot( new int[] {0,1,-1,7,-7,6});

        assertEquals(3,actual1);
        assertEquals(-1,actual2);
        assertEquals(0,actual3);
        assertEquals(5,actual4);

    }
}