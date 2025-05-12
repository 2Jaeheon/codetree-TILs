import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.next().length();
        int b = sc.next().length();
        int c = sc.next().length();


        int max = -1;
        if(a > b) {
            max = a;
        } else if(c > a){
            max = c;
        } else {
            max = b;
        }

        int min = 10000;
        if (a > b){
            min = b;
        } else if(b > c){
            min = c; 
        } else {
            min = a;
        }
        System.out.println(max - min);
    }
}