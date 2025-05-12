import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.next().length();
        int b = sc.next().length();
        int c = sc.next().length();


        int max = 0;
        int min = 0;

        max = Math.max(a, Math.max(b, c));
        min = Math.min(a, Math.min(b, c));
    
        System.out.println(max - min);
    }
}