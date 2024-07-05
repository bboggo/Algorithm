import java.util.Random;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 크기 입력받기
        int n = sc.nextInt(); //row
        int m = sc.nextInt(); //column

        // 크기만큼 2차원 배열 만들기
        int[][] arr1 = new int[n][m]; //첫번째 행렬 A
        int[][] arr2 = new int[n][m]; //두번째 행렬 B

        // 첫번째 행렬 입력받기
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }

        // 두번째 행렬 입력받기
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }

        // 더해서 출력하기
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                System.out.print(arr1[i][j] + arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

