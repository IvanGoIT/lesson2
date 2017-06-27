public class Types {
    public static void main(String[] args) {
        // типы перменных
        byte b = 20;
        short sh = 150;
        int i = 10;
        long l = 100500;
        float fl = 234.5f;
        float fl2 = 234; // fl2 = 234.0f;
        double d = 23.0f;

        char c = '5';
        char c2 = 5; // стоит избегать

        boolean bool = true;
        boolean bool2 = false;

        String str = "string 1";
        str = "string 2";
        str = "string 2" + "00";
        str += 100500;
        System.out.println(str);


    }
}
