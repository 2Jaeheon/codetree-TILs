import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        
        int aCount = 0;
        int len = 0;

        for(int i = 0; i < N; i++){
            String str = sc.next();
            if(str.charAt(0) == 'a'){
                aCount++;
            }
            len += str.length();
        }

        System.out.println(len + " " + aCount);
    }
}