import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст");
        String line = sc.nextLine();
        System.out.println("вывод: " + line);

        System.out.println("Введите число");
        int integer = sc.nextInt();
        System.out.println("вывод: " + integer);
    }
}
