public class DiceBoard {

    static int count = 0;

    static void diceBoard(int currSum, int endvalue, String result) {

        if (currSum == endvalue) {
            count++;
            System.out.print(result + ", ");
            return;
        }
        if (currSum > endvalue) {
            return;
        }

        for (int i = 1; i <= 6; i++) {

            if (currSum + i <= endvalue) {
                diceBoard(currSum + i, endvalue, result + i);
            }
        }
    }

    public static void main(String[] args) {
        diceBoard(0, 30, "");

        System.out.println("Count " + count);
    }
}
