import java.util.Scanner;

public class Example {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите текст и нажмите Enter");
        String line = sc.nextLine();
        System.out.println("Ввод успешно произведен!");

        System.out.println("");
        System.out.println("обрабатываю...");
        System.out.println("");

        System.out.println("-----------------------------");
        System.out.println("Вот что получили:");
        System.out.println(line);
        System.out.println("-----------------------------");
    }
}
