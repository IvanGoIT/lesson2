import java.util.Scanner;

public class HomeWork {
    public static boolean isInt(String str) {
        try {
            int i = Integer.parseInt(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int i;

        while(true)
        {
            try {
                System.out.println("Введите число:");
                i = sc.nextInt();
                sc.nextLine();
                break;
            } catch (Exception e){
                System.out.println("Введено не число!!!");
                sc.nextLine();
            }
        }
        //

        System.out.println("Вы ввели " + i);
    }
}
