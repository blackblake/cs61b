package IntList;

import static org.junit.Assert.*;
import org.junit.Test;

public class SquarePrimesTest {

    /**
     * Here is a test for isPrime method. Try running it.
     * It passes, but the starter code implementation of isPrime
     * is broken. Write your own JUnit Test to try to uncover the bug!
     */
    @Test
    public void testSquarePrimesSimple() {
        IntList lst = IntList.of(11, 15, 16, 17, 18);
        boolean changed = false;
        boolean o;
        for(int i=0;i<lst.size();i++){
            o = IntListExercises.squarePrimes(lst);
            if(o == true){
                changed =true;
            }
        }
        assertEquals("121 -> 15 -> 16 -> 289 -> 18", lst.toString());
        assertTrue(changed);
    }
}
