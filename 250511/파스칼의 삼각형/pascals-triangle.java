import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        List<List<Integer>> triangle = new ArrayList<>();

        for(int i = 0; i < N; i++){
            List<Integer> row = new ArrayList<>();
            for(int j = 0; j <= i; j++){
                if(j == 0 || j == i){
                    row.add(1);
                } else {
                    int value = triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j);
                    row.add(value);
                }
            }
            triangle.add(row);
        }

        for(List<Integer> row : triangle) {
            for(int value : row){
                System.out.print(value + " ");
            }
            System.out.println();
        }
    
    }
}