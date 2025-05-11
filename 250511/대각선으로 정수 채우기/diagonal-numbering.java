import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        int[][] arr = new int[N][M];
        for(int i = 0; i < N; i++){
            for(int j = 0; j < M; j++){
                arr[i][j] = 1;
            }
        }
        
        // 00 / 01 10 / 02 11 20 / 03 12 21 30 / 04 13 22 32 /  
        for(int k = 0; k <= N + M - 2; k++){
            for(int i = 0; i <= k; i++){
                int row = i;
                int column = k - i;
                
            }
        }
    }
}