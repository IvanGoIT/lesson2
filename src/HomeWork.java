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
        String str = sc.nextLine();

        while(isInt(str))
        {
            str = sc.nextLine();
        }
    }
}
