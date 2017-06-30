import java.util.Scanner;

public class Answers {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;


        int max = a < b ? b : a;
        int max2 = Math.max(a, b);

        System.out.println(max);
        System.out.println(max);

        ///////////////////////////

        int i = 1;
        int e = 2;
        int r = 3;
        int y = 4;

        int max3 = Math.max(i, Math.max(e, Math.max(r, y)));
        System.out.println(max3);


        ///////////////////////////

        Scanner sc = new Scanner(System.in);
        int readInt = sc.nextInt();
        sc.nextLine();
        String readLine = sc.nextLine();

        System.out.println("readInt = " + readInt);
        System.out.println("readLine = " + readLine);
    }
}
