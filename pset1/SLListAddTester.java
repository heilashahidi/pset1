
package pset1;
import org.junit.Test;
import static org.junit.Assert.*;

public class SLListAddTester {
    @Test public void test0() {
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);
        assertTrue(l.repOk());

        //write a sequence of assertTrue method invocations that
        //perform checks on the values for all the declared fields
        //of list and node objects reachable from 1

        assertTrue(l.header != null);

        assertTrue(l.header.elem == true);
        assertTrue(l.header.next == null);
        

    }


    @Test public void test1(){
        SLList l = new SLList();
        assertTrue(l.repOk());
        l.add(true);  
    
        assertTrue(l.repOk());
        l.add(false);
        assertTrue(l.repOk());

        //write a sequence of assertTrue method invocations that
        //perform checks on the values for all the declared fields
        //of list and node objects reachable from 1

        assertTrue(l.header != null);
        assertTrue(l.header.elem == false);
        assertTrue(l.header.next != null); 
        assertTrue(l.header.next.elem == true); 
        assertTrue(l.header.next.next == null);

        
    }
}


