package execute;

import math_quiz.SUM;
import util.Util;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int x = (int) (Math.random() * 10);
        int y = (int) (Math.random() * 10);

        SUM sumLevel1 = new SUM();
        Util.showMessageCal(x,y," + ");
        int studentAnswer = new Scanner(System.in).nextInt();
        System.out.println(sumLevel1.answer(sumLevel1.sum(x, y), studentAnswer));
//        Util.showSum(x, y, sumLevel1.sum(x, y));
    }
}
