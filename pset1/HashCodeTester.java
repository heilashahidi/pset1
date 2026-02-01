package pset1;

import static org.junit.Assert.*;
import org.junit.Test;


// The contract for java.lang.Object additionally requires the following property that relates equals and
// hashCode1:
// P5 : If two objects are equal according to the equals(Object) method, then calling the hashCode
// method on each of the two objects must produce the same integer result.
// Implement test methods in the following class HashCodeTester such that: 
// (1) each test method has exactly one invocation of assertTrue(...) or assertFalse(...); 
// (2) the property is tested with respect to each combination of the three object types (C, D, or Object) for the inputs to equals, so the test suite
// must have at least nine tests:

public class HashCodeTester {
    /*
    *
    * P5: If two objects are equal according to the equals(Object)
    *     method, then calling the hasCode method on each of the 
    *     two objects must produce the same integer result.
    */
    
    // your test methods go here 
     @Test public void p5_C_C() {
        C x = new C(0);
        C y = new C(0);
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_C_D() {
        C x = new C(0);
        D y = new D(0, 0);
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_C_Object() {
        C x = new C(0);
        Object y = new Object();
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_D_C() {
        D x = new D(0, 0);
        C y = new C(0);
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_D_D() {
        D x = new D(0, 0);
        D y = new D(0, 0);
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_D_Object() {
        D x = new D(0, 0);
        Object y = new Object();
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_Object_C() {
        Object x = new Object();
        C y = new C(0);
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_Object_D() {
        Object x = new Object();
        D y = new D(0, 0);
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }

    @Test public void p5_Object_Object() {
        Object x = new Object();
        Object y = new Object();
        boolean A = x.equals(y);
        boolean B = (x.hashCode() == y.hashCode());
        assertTrue(!A || B); 
    }
}
