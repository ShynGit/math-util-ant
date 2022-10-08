/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shyn.mathutil.core;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static com.shyn.mathutil.core.MathUtil.*;

/**
 *
 * @author SE160311
 */

@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {
    
    // 1. Chuẩn bị bộ data là mảng 2 chiều
    // Mảng Object, số thì dùng Wrapper class - class gói các primitive
    // Integer -> int, Long -> long
    @Parameterized.Parameters
    public static Object[][] initData() {
        // int a[] = {5, 10, 15, 20, 25};
        // int b[][] = {{1, 0}, {1, 1}, {2, 2}, {6, 3}, {24, 4}, {120, 5}, {720, 6}};
//        int c[][] = {{1, 0}, 
//                     {1, 1}, 
//                     {2, 2}, 
//                     {6, 3}, 
//                     {24, 4}, 
//                     {120, 5}, 
//                     {720, 6}};
        
        return new Integer[][] {{1, 0}, 
                                {1, 1}, 
                                {2, 2}, 
                                {6, 3}, 
                                {24, 4}, 
                                {120, 5}, 
                                {720, 6}};
    }
    
    // Ta sẽ map/ánh xạ các cột của mỗi dòng vào biến expected và actual
    @Parameterized.Parameter(value = 0)
    public long expected;
    
    @Parameterized.Parameter(value = 1)
    public int n;
    
    @Test
    public void TestFactorialGivenRightArgumentReturnWell() {
        assertEquals(expected, getFactorial(n));
    }
}

// Phân tích cách ta viết code test cho phần test hàm getF() hôm trước

// Assert.assertEquals(24, MathUtil.getFactorial(4));

// lệnh này lặp đi lặp lại cho các data ta đưa vào để test
// Nếu có cách nào đó mà tách data ra riêng sau đó từ từ feed data này vào câu lệnh test hàm ở trên
// Vậy chỉ cần 1 lệnh gọi hàm, data cứ thế tuần tự đẩy vào
// Kĩ thuật tách data ra khỏi câu lệnh test sau đó đẩy vào, giúp rút gọn số câu lệnh
// giúp dễ dàng kiểm tra tính thiếu đủ của các test case -> DDT - DATA DRIVEN TESTING : Viết code kiểm thử
// hướng theo tách data với tên gọi khác là kiểm thử theo kiểu tham số hóa - PARAMETERIZED
// Data convert thành biến

// Chơi với DDT ta cần bộ data test - tách riêng
// Các tham số ứng với bộ data - chính là các biến dùng trích data ra

// TOÀN BỘ CODE TRONG NÀY ĐƯỢC VIẾT RA DÙNG ĐỂ TEST CODE CHÍNH Ở SOURCE PACKAGES
// CODE ĐƯỢC VIẾT RA ĐỂ ĐI TEST CODE KHÁC -> TEST SCRIPT
// 1 TEST SCRIPT CHỨA NHIỀU CODE ĐỂ TEST HÀM CHÍNH
// 1 TEST SCRIPT CHỨA NHIỀU TEST CASE - CÁC TÌNH HUỐNG XÀI HÀM
// 1 TEST SCRIPT CÓ THỂ XÀI DDT ĐỂ DỄ BẢO TRÌ CODE TEST
// VIỆC VIẾT CODE CHÍNH CÓ THỂ XÀI TDD