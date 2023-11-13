public class Lesson2 {
    public static void main(String[] args) {
        // oon kien thuc toan tu trong java
        int x = 2;
        int y = 2;
        //1.1 toan tu !=
        System.out.println(x != y);
        // 1.2 toan tu <==
        x = 4;
        y = 10;
        System.out.println(x <= y);

        tong2So();

        int z = hieu2So();
        System.out.println("z=" + z);

        int c = tich2So(8, 9);
        System.out.println("c=" + c);
    }

    public static void tong2So() {
        System.out.println("tong 2 so 2 va 3 la " + (2 + 3));
    }

    // ham khai bao kieu du lieu gi thi se phai return ve gia tri cua kieu giu lieu do
    public static int hieu2So() {
        return 10;
    }

    // ham co tham so truyen vao (parameter)
    public static int tich2So(int a, int b) {
        return a * b;
    }
}


