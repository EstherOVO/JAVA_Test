package Test01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("출력할 단을 입력해 주세요 : ");
        int number = scanner.nextInt();

        for (int i = number; i <= number; i++) {
            System.out.println(i + "단 : ");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
