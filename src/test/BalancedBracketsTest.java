package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
//    @Test
//    public void emptyTest() {
//        assertEquals(true, true);
//    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }


    @Test
    public void onlyBracketsContainsBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[][]]"));
    }
    @Test
    public void onlyBracketsContainsThreeBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[[[]]]]"));
    }
    @Test
    public void onlyBracketsContainsFourBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]][]"));
    }

    @Test
    public void onlyBracketsContainsFiveBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void onlyBracketsContainsSixBracketsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }



    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBracketsTwoReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void onlyBracketsThreeReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[]]]"));
    }
    @Test
    public void onlyBracketsFourReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]"));
    }
    @Test
    public void onlyBracketsFiveReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void onlyBracketsSixReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]][]"));
    }
}
