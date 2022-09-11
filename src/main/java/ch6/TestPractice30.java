package ch6;


public class TestPractice30 {
    public static void main(String[] args) {
        int firstSum, secondSum, dice1, dice2;
        // 2, 3, 12, you win
        // 7, 11, you lose
        // 4, 5, 6, 8, 9, 10, established. Need a second roll
        dice1 = Practice30.roll();
        dice2 = Practice30.roll();
        firstSum = dice1 + dice2;
        System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, firstSum);
        if (firstSum == 2 || firstSum == 3 || firstSum == 12) {
            System.out.println("You win");
        } else if (firstSum == 7 || firstSum == 11) {
            System.out.println("You lose");
        } else {
            while (true) {
                dice1 = Practice30.roll();
                dice2 = Practice30.roll();
                secondSum = dice1 + dice2;
                System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, secondSum);
                if (secondSum == firstSum) {
                    System.out.println("You win");
                    break;
                } else if (secondSum == 7) {
                    System.out.println("You lose");
                    break;
                }
            }
        }
    }
}
