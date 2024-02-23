package Test01;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력해 주세요 : ");
        double firstNumber = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력해 주세요 : ");
        double secondNumber = scanner.nextInt();

        System.out.print("연산자를 입력해 주세요(+, -, *, / 중 입력) : ");
        String operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.println("· 합 : " + (firstNumber + secondNumber));
                break;
            case "-":
                System.out.println("· 차 : " + (firstNumber - secondNumber));
                break;
            case "*":
                System.out.println("· 곱 : " + (firstNumber * secondNumber));
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("0으로 나눌 수 없습니다.");
                    break;
                } else {
                    System.out.println("· 몫 : " + (firstNumber / secondNumber));
                    break;
                }
            default:
                System.out.println("잘못된 입력입니다. 다시 시도해 주시기를 바랍니다.");
        }
    }
}
