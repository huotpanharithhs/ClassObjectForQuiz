package util;

public class Util {
    public static void showSum(int value1, int value2, int result) {
        System.out.println(value1 + " + " + value2 + " = " + result);
    }
    public static void showSub(int value1, int value2, int result) {
        System.out.println(value1 + " - " + value2 + " = " + result);
    }
    public static void showMessageCal(int x , int y , String sign){
        System.out.print(x + sign + y + " = ");
    }
}
