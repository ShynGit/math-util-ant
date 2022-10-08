/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shyn.mathutil.core;

import org.junit.Assert;
import org.junit.Test;


/**
 *
 * @author SE160311
 */

// Test main method of the project/MathUtil
// In this class, we will call getFactorial(), have method to compare expected value and actual value
// Color:   Red - Fail
//          Green - Pass
// Wanna test? Using Unit Testing Framework
// Ex: JUnit, TestNG(Java), xUnit, MSTest, NUnit(C#), PHPUnit(PHP)

// Write code to test code is called Unit Testing
// Code script in this class is called Test Script (Using to test main code in main)
// Test Script is some script wrote to test main code (DAO, DTO, Controller, API, ...)
// If wanna test, you need to write test case
// Test script will use that test case
// Coding convention - Quy tắc viết code
			// Tên method của test script phải nói lên ý nghĩa của việc kiểm thử tình
			// huống đang test

// Green - When all test case passed. Red - if only 1 fail -> red -> method fail
// Ý nghĩa của quy tắc: Nếu đã test, đã liệt kê các test case thì chúng phải đúng hết
// chỉ cần 1 thằng sai -> hàm không ổn định -> hàm sai
// Đúng phải đúng hết
// Đôi khi không phải actual value sai mà expected value sai -> lỗi của QC
public class MathUtilTest {
    
    // @Test ra lệnh cho thư viện JUnit mình đã add/import
    // tự động generate ra hàm public static void main() biến hàm tryJUnitComparison()
    // thành hàm main() và gửi main này cho JVM chạy
    @Test
    // Try JUnit to compare expected value and actual value
    // không xài bừa bãi hàm của thư viện JUnit mà phải viết có quy tắc định trước. Quy tắc định trước nằm ở @ - Annotation
    public void tryJUnitComparison() {
        Assert.assertSame(100, 100);
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        // #Test 1: n = 0 -> Expected: 1, Actual: unknown
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);
        
        // #Test 2: n = 1 -> Expected: 1, Actual: unknown
        expected = 1;
        actual = MathUtil.getFactorial(1);
        Assert.assertEquals(expected, actual);
        
        // #Test 3: n = 2 -> Expected: 2, Actual: unknown
        Assert.assertEquals(2, MathUtil.getFactorial(2));
    }
    
    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {
        // #Test 4: n = 3 -> Expected: 6, Actual: unknown
        Assert.assertEquals(6, MathUtil.getFactorial(3));
        
        // #Test 5: n = 4 -> Expected: 24, Actual: unknown
        Assert.assertEquals(24, MathUtil.getFactorial(4));
        
        // #Test 6: n = 5 -> Expected: 120, Actual: unknown
        Assert.assertEquals(120, MathUtil.getFactorial(5));
    }
    
    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {
        System.out.println("Hope to see the Exception. Illegal Argument Exception");
        MathUtil.getFactorial(-5);
    }
}
