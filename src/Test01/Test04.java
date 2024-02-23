package Test01;

public class Test04 {
    public static void main(String[] args) {

        int[][] arr = {{1, 2}, {3, 4}, {5, 6}, {7, 8}};

        System.out.print("§ 모든 2차원 정수 배열 : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == arr.length - 1 && j == arr[i].length - 1) {
                    System.out.print(arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + ", ");
                }
            }
        }

        int sum = 0;
        for (int s = 0; s < arr.length; s++) {
            for (int k = 0; k < arr[s].length; k++) {
                sum += arr[s][k];
            }
        }

        System.out.println("\n§ 2차원 배열의 총합 : " + sum);
    }
}
