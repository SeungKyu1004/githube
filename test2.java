import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        if (a>1) {
            System.out.println("a는 1보다 큽니다.");
        } else {
            System.out.println("a는 1보다 작습니다.");
        }
    }
}
