package com.vti.switchcase;

public class Switchcase {
    public static void main(String[] args) {
        int i = 3;
        switch (i) { //kiem tra gia tri cua i co tuong ung voi cac trung hop trong khoi switch hay khong
            case 1: // y nghia check i==1
                System.out.println("i=1");
            case 2:// y nghia check i ==2
                System.out.println("i =2");
            case 3:
                System.out.println("i=3");
            default:
                System.out.println(" i la mac dinh");
        }
        System.out.println("ket thuc chuong trinh");

        int month = 9;
        switch (month) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("thang vua nhap la thang trong 1 nam");
            default:
                System.out.println("thang chi duoc phep tu 1-12");

                String ten = "abc";
                switch (ten) {
                    case "xyz":
                        System.out.println("ten la xyz");
                    case "abc"  :
                        System.out.println("ten la abc");
                    default:
                        System.out.println("ten khong dung");
                        break;
                }
        }
    }
}


