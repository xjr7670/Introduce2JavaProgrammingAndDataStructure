package ch6;

public class Practice32 {
    public static void main(String[] args) {
        // 2, 3, 12, you win
        // 7, 11, you lose
        // 4, 5, 6, 8, 9, 10, established. Need a second roll
        int lastSum = 0, currSum = 0, dice1, dice2, times = 15000, youWinCount = 0;
        boolean needSecondSum = false;

        while (times-- > 0) {

            dice1 = Practice30.roll();
            dice2 = Practice30.roll();

            currSum = dice1 + dice2;

            if (needSecondSum) {
                if (lastSum == currSum) {
                    ++youWinCount;
                    needSecondSum = false;
                } else if (currSum == 7) {
                    needSecondSum = false;
                }
            } else {
                switch (currSum) {
                    case 2:
                    case 3:
                    case 12:
                        ++youWinCount;
                        break;
                    case 4:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                        needSecondSum = true;
                        lastSum = currSum;
                        break;
                    default:
                        break;
                }
            }
        }

        System.out.printf("You win %d times\n", youWinCount);
    }
}
