/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shyn.mathutil.core;

/**
 *
 * @author SE160311
 */

// Class utils of math using in all project
// Clone util java.Math of Java
// With the general things, we will design them static
public class MathUtil {
    public static final double PI = 3.141592653589793;
    
    // Calculate factorial
    // Not accept n < 0 or n >= 21
    // 0! = 1! = 1
    public static long getFactorial(int n) {
        if(n > 20 || n < 0) throw new IllegalArgumentException("Invalid n. n must be between 1..20");
        return (n == 1 || n == 0) ? 1 : getFactorial(n-1)*n;
    }
}

// biến tích lũy - acc/accumulation
// CODING CONVENTION
// Alt + Shift + F -> bullshit (vẫn có thể dùng nhưng không lạm dụng)

// TA SẼ HỌC SƠ VỀ KHÁI NIỆM TDD - TEST DRIVEN DEVELOPMENT
// Là kĩ thuật lập trình áp dụng cho dân dev để gia tăng chất lượng code, giảm thiểu công 
// suất tìm bug, phát hiện bug sớm
// TDD yêu cầu dev khi viết hàm/class phải viết luôn các bộ kiểm thử/ test case/ các đoạn
// code dùng thử hàm --> ktra tính đúng đắn của hàm

// Sau khi có được tên hàm ta viết luôn các tình huống xài hàm
// chấp nhận hàm chạy sai dù code chưa xong
// Sau đó tối ưu chỉnh sửa code để đảm bảo code chạy đúng
// Quá trình Sai - tối ưu - đúng - sai - tối ưu - đúng (cycle)