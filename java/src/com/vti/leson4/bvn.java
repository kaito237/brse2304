package com.vti.leson4;

import java.util.Scanner;

public class bvn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chọn hình để tính diện tích:");
        System.out.println("1. Hình vuông");
        System.out.println("2. Hình tròn");
        System.out.println("3. Hình tam giác");

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Nhập cạnh của hình vuông:");
                int sideSquare = validatePositiveInteger(scanner);
                System.out.println("Diện tích hình vuông: " + HinhHoc.tinhDienTichHinhVuong(sideSquare));
                break;
            case 2:
                System.out.println("Nhập bán kính của hình tròn:");
                double radiusCircle = validatePositiveDouble(scanner);
                System.out.println("Diện tích hình tròn: " + HinhHoc.tinhDienTichHinhTron(radiusCircle));
                break;
            case 3:
                System.out.println("Nhập chiều cao của tam giác:");
                int heightTriangle = validatePositiveInteger(scanner);
                System.out.println("Nhập độ dài cạnh đáy của tam giác:");
                int baseTriangle = validatePositiveInteger(scanner);
                System.out.println("Diện tích tam giác: " + HinhHoc.tinhDienTichTamGiac(heightTriangle, baseTriangle));
                break;
            default:
                System.out.println("Giá trị bạn vừa nhập không đúng.");
        }
    }

    private static int validatePositiveInteger(Scanner scanner) {
        int value; // kiem tra so nguyen duong
        do {
            System.out.println("Nhập một số nguyên dương:");
            while (!scanner.hasNextInt()) {
                System.out.println("Nhập lại một số nguyên dương:");
                scanner.next();
            }
            value = scanner.nextInt();
        } while (value <= 0);
        return value;
    }

    private static double validatePositiveDouble(Scanner scanner) {
        double value;  // kiem tra so thuc duong
        do {
            System.out.println("Nhập một số thực dương:");
            while (!scanner.hasNextDouble()) {
                System.out.println("Nhập lại một số thực dương:");
                scanner.next();
            }
            value = scanner.nextDouble();
        } while (value <= 0);
        return value;
    }
}

class HinhHoc {
    static final double PI = 3.14;

    static double tinhDienTichHinhVuong(int canh) {
        return canh * canh;
    }

    static double tinhDienTichHinhTron(double banKinh) {
        return PI * banKinh * banKinh;
    }

    static double tinhDienTichTamGiac(int chieuCao, int canhDay) {
        return 0.5 * chieuCao * canhDay;
    }
}
