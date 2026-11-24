package com.bits.leave;


public class LeaveCalculator {

     // BITS ID: s2024sl70045
    // Calculate remaining leave balance
    public int calculateLeaveBalance(int totalLeaves, int leavesTaken) {
        return totalLeaves - leavesTaken;
    }

    // Calculate leave encashment amount
    public double calculateLeaveEncashment(int leavesToEncash, double dailySalary) {
        return leavesToEncash * dailySalary;
    }
}
