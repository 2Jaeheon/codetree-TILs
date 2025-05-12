import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char x = sc.next().charAt(0);

        int answer = 0;
        for (char c : str.toCharArray()) {
            if (c == x) answer++;
        }

        System.out.println(answer);
    }
}