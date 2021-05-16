import java.util.Scanner;

public class DaoNguocMang {
    public static void main(String[] args) {
        System.out.println("Chuong trinh dao nguoc mang");
        int size;
        int [] array;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập kích thước của mảng: ");
            size = sc.nextInt();
            if (size>10)
                System.out.println("limit array");
        }while (size > 10);
        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + " :");
            array[i] = sc.nextInt();
            i++;
        }

        System.out.printf("%-20s%s", "Mảng vừa nhập là: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

        // array reverse
        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }

        System.out.println();
        System.out.printf("%-10s%s", "Reverse array: ", "");
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }

    }
}
