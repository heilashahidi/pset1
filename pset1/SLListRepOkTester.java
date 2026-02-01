
package pset1;
import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

// Implement test methods in the following class SLListRepOkTester such that: 
// (1) each test allocates exactly one list l; 
// (2) each test method makes exactly one invocation l.repOk(); 
// (3) each test method invokes assertTrue(l.repOk()) or assertFalse(l.repOk()) as its last statement; 
// (4) no invocation of add is made in any test method; 
// (5) the test suite as a whole consists of all singly-linked list data structures –
// whether acyclic or not – that can possibly be constructed using up to 2 nodes.

public class SLListRepOkTester {

    //empty list
    @Test public void t0(){
        SLList l = new SLList();
        assertTrue(l.repOk());
    }

    //one node, no cycle
    @Test public void t1(){
        SLList l = new SLList();
        Node n = new Node();
    
        l.header = n;
        assertTrue(l.repOk());
        
    }

    //one node, self-cycle
    @Test public void t2(){
        SLList l = new SLList();
        Node n = new Node();
      
        l.header = n;
        n.next = n;
        assertFalse(l.repOk());
        
    }

    //two nodes, no cycle
    @Test public void t3(){
        SLList l = new SLList();
        Node n = new Node();
        Node d = new Node();

        l.header = n;
        n.next = d;
        assertTrue(l.repOk());
    
    }

    //two nodes, cycle back to first node
    @Test public void t4(){
        SLList l = new SLList();
        Node n = new Node();
        Node d = new Node();

        l.header = n;
        n.next = d;
        d.next = n;
        assertFalse(l.repOk());
        
    }

    //two nodes, second node self cycles to itself
     @Test public void t5(){
        SLList l = new SLList();
        Node n = new Node();
        Node d = new Node();

        l.header = n;
        n.next = d;
        d.next = d;
        assertFalse(l.repOk());
        
    }
}
