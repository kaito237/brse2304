package com.vti.leson1;

public class Lesson1 {
        public static void main(String[] args) {
            System.out.println("Hello World!");


//            toan ru co ban
//            +-*/( chia lay phan nguyen) %( chia lay phan du)

            int a =1;
            int b=2;
            int c = a+b;
            int d = a - b;
            int e = a / b;
            int f = a % b;
            int  g= a * b;
            System.out.println("tong 2 so la: " +c);
            System.out.println("hieu 2 so la: " +b);
            System.out.println("tich 2 so la: " +d);
            System.out.println("thuong 2 so la: " +e);
            System.out.println("chia lay du 2 so la: " +f);
            System.out.println("tich so la: " +g);


//            toan tu tich phan
//toan tu =
            int x1 = 654;

//            toan tu +-
            int x2 = 1;
            int x3 = 2;
            x2 += x3; // cong 2 gia tri roi gan gia tri toan hang cho ben trai
            // tuong duong x2 + x3
            System.out.println("tong" + x2);

            x2 -= x3;
            x2 *= x3;
            x2 /=x3;
            x2 %= x3;
 // toan tu tiep theo
            // dich trai <<=
            // dich phai; >>=
            // phep trai bit :&=
            // phep or loai tru bit: ^=
            // phep or bit: |=


            // toan tu logic
            // so sanh bang: ==
            int s = 4;
            int p= 4;
            boolean check;
            check= (s==p);
            System.out.println("check bang gi day :" + check);


            System.out.println(s==p);
            if (a ==p) {
                System.out.println("s bang p");
            }

        }

}
