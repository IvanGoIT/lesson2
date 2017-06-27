public class LogicOperators {
    public static void main(String[] args) {
        // ---------------------------------------------------------
        // логические операторы

        int a = 100;
        int b = 100;

        boolean resultEqual = a == b;
        boolean result = a > b;

        boolean result2 = a <= b;
        boolean result3 = a >= b;

        boolean result4 = a != b;

        // && логическое И
        boolean tt = true;
        boolean ff = false;

        boolean result5 = tt && ff;

        //System.out.println("true && true = " + (true && true));
        //System.out.println("true && false = " + (true && false));
        //System.out.println("false && true = " + (false && true));
        //System.out.println("false && false = " + (false && false));

        // || логическое ИЛИ
        // System.out.println("true || true = " + (true || true));
        // System.out.println("true || false = " + (true || false));
        // System.out.println("false || true = " + (false || true));
        // System.out.println("false || false = " + (false || false));

        // ! логическое НЕ
        boolean bb = false;
        boolean aa = true;
        System.out.println(!bb);
        System.out.println(!aa);
    }
}
