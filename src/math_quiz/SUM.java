package math_quiz;

public class SUM {
    public int sum(int x, int y) {
        return x + y;
    }

    public String answer(int answer, int studentAnswer) {
        if (answer == studentAnswer) {
            return "Correct.";
        }
        return "Incorrect";
    }
}
