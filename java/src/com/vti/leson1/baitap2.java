package com.vti.leson1;
// bai tap nhap 2 so nguyen duong tu ban phim va in ra tong 2 so do
import java.util.Scanner;
public class baitap2 {
    public static void main(String[] args) {
//            // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
//            Scanner scanner = new Scanner(System.in);
//
//            // Nhập số thứ nhất
//            System.out.print("Nhập số thứ nhất: ");
//            int soThuNhat = scanner.nextInt();
//
//            // Nhập số thứ hai
//            System.out.print("Nhập số thứ hai: ");
//            int soThuHai = scanner.nextInt();
//
//            // Tính tổng
//            int tong = soThuNhat + soThuHai;
//
//            // In ra tổng
//            System.out.println("Tổng hai số là: " + tong);
//
//
//            scanner.close();


                // Tạo một đối tượng Scanner để đọc dữ liệu từ bàn phím
                Scanner scanner = new Scanner(System.in);

                // Nhập số từ bàn phím
                System.out.print("Nhập một số: ");
                int soNhap = scanner.nextInt();

                // Kiểm tra và in ra thông tin về số nhập
                if (soNhap > 0) {
                    System.out.println("Số " + soNhap + " là số dương.");
                } else if (soNhap < 0) {
                    System.out.println("Số " + soNhap + " là số âm.");
                } else {
                    System.out.println("Số " + soNhap + " bằng 0.");
                }

                scanner.close();
            }
        }






