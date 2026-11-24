
package com.bits.leave;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeaveCalculatorTest {

    LeaveCalculator calculator = new LeaveCalculator();

    // Test 1: Verify remaining leave balance
    @Test
    public void testLeaveBalance() {
        int result = calculator.calculateLeaveBalance(30, 10);
        assertEquals(20, result);
    }

    // Test 2: Verify leave encashment amount
    @Test
    public void testLeaveEncashment() {
        double result = calculator.calculateLeaveEncashment(5, 1000.0);
        assertEquals(5000.0, result, 0.01);
    }

    // Test 3: Verify encashment when no leaves are encashed
    @Test
    public void testZeroLeaveEncashment() {
        double result = calculator.calculateLeaveEncashment(0, 1000.0);
        assertEquals(0.0, result, 0.01);
    }
}
