import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int answer = 0;
        for(int i = 0; i < 10; i++){
            answer += sc.next().length();
        }

        System.out.println(answer);
    }
}