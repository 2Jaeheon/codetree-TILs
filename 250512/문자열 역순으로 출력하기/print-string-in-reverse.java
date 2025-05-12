import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new LinkedList<>();

        for(int i = 0; i < 4; i++){
            list.add(sc.next());
        }

        for(int i = 3; i >= 0; i--){
            System.out.println(list.get(i));
        }
    }
}