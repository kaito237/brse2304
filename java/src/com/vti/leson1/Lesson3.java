package com.vti.leson1;

import java.util.Scanner;

public class Lesson3 {
    public static void main(String[] args) {
//        String str = "xin chao";
//        System.out.println(str);
//
//        String str2="cac ban co khoe khong" +"minh ten la kaito";
//        System.out.println(str2);
//
//        System.out.println(str+str2);
//
//        Scanner scan = new Scanner(System.in);
//        System.out.println("nhap so bat ki ");
//        scan.nextInt();
//
//
//        Scanner scan2= new Scanner(System.in);
//        System.out.println("nhap ten cua chi");
//        scan2.nextLine();
//        scan.close();
//        scan2.close();


        // cau dieu kien if els
        boolean check = false;


        Scanner scan = new Scanner(System.in);
        System.out.println("nhap gia tri bien x can kiem tra:");
        int x = scan.nextInt();

        if (x <10)
        {
            System.out.println("x co gia tri nho hon 10 ");

        } else {
            System.out.println("x co gia tri lon hon hoac 10");

        }


      x = x > 10 ? 10 : 3;
        String kiemTra = (x >10) ?  " x lon hon 10" : "x nho hon 10";
        System.out.println(kiemTra);


        int z = 3;
        int y = (z>5) ? 4 : 1;
        System.out.println(y);
    }


}
