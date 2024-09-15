public class BowlingView {
    public void displayThrowResult(String cowName, int firstThrow, int secondThrow, boolean isStrike, boolean isSpare) {
        System.out.println(cowName + " threw: " + firstThrow + " pins in first throw.");
        if (!isStrike) {
            System.out.println(cowName + " threw: " + secondThrow + " pins in second throw.");
        }
        if (isStrike) {
            System.out.println(cowName + " got a Strike!");
        } else if (isSpare) {
            System.out.println(cowName + " got a Spare!");
        } else {
            System.out.println(cowName + " got an Open.");
        }
    }

    public void displayScore(String cowName, int score) {
        System.out.println(cowName + " total score: " + score);
    }

    public void displayGameStart() {
        System.out.println("Game is starting...");
    }

    public void displayGameEnd() {
        System.out.println("Game has ended.");
    }

    public void displayWinner(String cowName) {
        System.out.println("The winner is: " + cowName);
    }
}