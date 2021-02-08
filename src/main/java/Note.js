/*package controller chứa các class thao tác với View làm nhiệm vụ điều hướng
package dao(data access object) làm nhiệm vụ truy cập dữ liệu và kết nối với service
package model tượng trưng cho các table trong database
package service nhận dữ liệu trả về làm nhiệm vụ xử lý logic*/

/*cần phải áp dụng nguyên tắc dependence trong solid để thiết kế các partern (Trừu tượng hoá mọi thứ , sử dụng abstract hoặc interface,)*/

/*anotation @Inject cho phép khai báo một đối tương mà không cần new trong constructor có tham số*/
/*
2 đối tượng statement,preparestament dùng để tương tác với câu sql, khác nhau giữa hai cái preparestatement có thể set được tham số trong câu sql*/