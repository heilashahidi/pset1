package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

// According to the contract for java.lang.Object any correct Java program must satisfy certain properties
// with respect to the equals methods; these properties include1:
// P1: For any non-null reference value x, x.equals(null) should return false;
// P2: It is reflexive: for any non-null reference value x, x.equals(x) should return true;
// P3: It is symmetric: for any non-null reference values x and y, x.equals(y) should return true if
// and only if y.equals(x) returns true; and
// P4: It is transitive: for any non-null reference values x, y, and z, if x.equals(y) returns true and
// y.equals(z) returns true, then x.equals(z) should return true;


// You are to implement a test suite that checks three of the four properties – namely, P1, P2, and P3 – with
// respect to the equals methods implemented in the three classes pset1.C, pset1.D, and java.lang.Object.
// Specifically, implement test methods in the following class EqualsTester such that: 
// (1) each test method has exactly one invocation of assertTrue(...) or assertFalse(...); 
// (2) each property is tested with respect to each of the three equals methods, e.g., the test suite must have three test methods for P1; 
// (3) each property is tested with respect to each combination of the three object types (C, D, or Object) for the inputs
// to equals, e.g., the test suite must have at least nine tests for P3:



public class EqualsTester {
    /*
    *   P1: For any non-null reference value x, x.equals(null) should return false.
    *   P1: x.equals(null) is always false for non-null x
    */

    @Test public void p1_Object() {
        assertFalse(new Object().equals(null));
    }

    @Test public void p1_C() {
        assertFalse(new C(1).equals(null));
    }

    @Test public void p1_D() {
        assertFalse(new D(1, 2).equals(null));
    }

    /*
    * 
    * P2: It is reflexive: for any non-null reference value x, x.equals(x)
    *     should return true.
    * P2: Reflexive — x.equals(x) is always true
    */

    @Test public void p2_Object() {
        Object x = new Object();
        assertTrue(x.equals(x)); 
    }

    @Test public void p2_C() {
        C x = new C(0);
        assertTrue(x.equals(x)); 
    }

    @Test public void p2_D() {
        D x = new D(0, 0);
        assertTrue(x.equals(x)); 
    }

    /*
    *
    * P3: It is symmetric: for any non-null reference values x and y, x.equals(y)
    *     should return true if and only if y.equals(x) returns true.
    *  P3: Symmetric — x.equals(y) and y.equals(x) must match (both true or both false)
    */

    // your test methods for P3 go here
    @Test public void p3_C_C() {
        C x = new C(0);
        C y = new C(0);
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_C_D() {
        C x = new C(0);
        D y = new D(0, 0);
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_C_Object() {
        C x = new C(0);
        Object y = new Object();
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_D_C() {
        D x = new D(0, 0);
        C y = new C(0);
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_D_D() {
        D x = new D(0, 0);
        D y = new D(0, 0);
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_D_Object() {
        D x = new D(0, 0);
        Object y = new Object();
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_Object_C() {
        Object x = new Object();
        C y = new C(0);
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_Object_D() {
        Object x = new Object();
        D y = new D(0, 0);
        assertTrue(x.equals(y) == y.equals(x)); 
    }

    @Test public void p3_Object_Object() {
        Object x = new Object();
        Object y = new Object();
        assertTrue(x.equals(y) == y.equals(x)); 
    }


    /*
    *  
    * P4: It is transitive: for any non-null refernces values x, y, and z,
    *     if x.equals(y) returns true and y.equals(z) returns true, then 
    *     x.equals(z) should return true.
    */

    // you do not need to write tests for P4
}
