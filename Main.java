import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        boolean flag = (a != b);
        if (flag) System.out.println("Переменные не равны!");
        else {
            System.out.println("Переменные равны!");
        }
    }
}