import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] full ={1,1,2,2,2,8};
        for (int i=0;i<6; i++){
            System.out.printf(full[i] - sc.nextInt() + "");
        }
    }
}
