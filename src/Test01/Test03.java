package Test01;

import java.util.Random;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100) * 1;

        Scanner scanner = new Scanner(System.in);

        System.out.print("1부터 100까지 사이의 숫자 맞추기 게임! \n숫자를 추측해 보세요 : ");
        int guessNumber = scanner.nextInt();

        for (int i = 1; i <= 100; i++) {
            if (guessNumber < randomNumber) {
                System.out.println("Up! 더 높은 숫자를 입력해 보세요!");
                guessNumber = scanner.nextInt();
            } else if (guessNumber > randomNumber) {
                System.out.println("Down! 더 낮은 숫자를 입력해 보세요!");
                guessNumber = scanner.nextInt();
            } else if (guessNumber == randomNumber) {
                System.out.println("축하드립니다. 정답입니다!");
                break;
            }
        }
    }
}
