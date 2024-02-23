package Test01;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("구구단을 알려드릴게요. 출력할 단을 입력해 주세요! ");
        System.out.print("몇 단부터 : ");
        int firstNumber = scanner.nextInt();

        System.out.print("몇 단까지 : ");
        int secondNumber = scanner.nextInt();

        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println("▶ " + i + "단 : ");
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
