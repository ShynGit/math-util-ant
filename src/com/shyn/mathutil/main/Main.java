/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shyn.mathutil.main;

import com.shyn.mathutil.core.MathUtil;

/**
 *
 * @author SE160311
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //tryTDDFirst();
        testFactorialGivenWrongArgumentThrowsException();
    }
    
    public static void testFactorialGivenWrongArgumentThrowsException() {
        System.out.println("Hope to see the Exception. Illegal Argument Exception");
        //MathUtil.getFactorial(-5);
    }
    
    // Try test code with TDD method
    // try using main function in math utils/core
    public static void tryTDDFirst() {
        
        // #Test case number 1
        // n = 1;
        // Using getFactorial(1) with expected value is 1
        long expected = 1;
        long actual = MathUtil.getFactorial(1);
        
        // Compare expected and actual value
        // Equal -> true, Not equal -> wrong
        System.out.println("Test 1! | status: " + 
                                   "Expected: " + expected +
                                  " | Actual: " + actual);
        
        // #Test case number 2
        // n = 2;
        // Using getFactorial(2) with expected value is 2
        expected = 6;
        actual = MathUtil.getFactorial(-5);
        
        // Compare expected and actual value
        // Equal -> true, Not equal -> wrong
        System.out.println("Test 2! | status: " + 
                                   "Expected: " + expected +
                                  " | Actual: " + actual);
    }
    
    // Test case là 1 tình huống xài app/ kiểm thử app/ kiểm thử tính năng
    // mà khi đó ta phải
    // - Đưa vào data mẫu
    // - Đưa ra giá trị kì vọng và chờ hàm/ tính năng xử lí và đưa ra kết quả
    // -> So sánh 2 kết quả. OK -> pass test case. Ngược lại fail test case
    
}
