public class BowlingController {
    private Cow[] cows;
    private BowlingView view;

    public BowlingController(Cow[] cows, BowlingView view) {
        this.cows = cows;
        this.view = view;
    }

    public void startGame() {
        view.displayGameStart();

        // วัวทุกตัวเล่น 10 รอบ
        for (int i = 0; i < 10; i++) {
            for (Cow cow : cows) {
                cow.playFrame(i, 10);  // ให้วัวแต่ละตัวโยนโบว์ลิ่งในแต่ละรอบ
                // แสดงผลการโยน
                view.displayThrowResult(
                    cow.getName(),
                    cow.getFrame(i).getFirstThrow(),
                    cow.getFrame(i).getSecondThrow(),
                    cow.getFrame(i).isStrike(),
                    cow.getFrame(i).isSpare()
                );
            }
        }

        // แสดงคะแนนรวม
        for (Cow cow : cows) {
            int totalScore = cow.calculateTotalScore();
            view.displayScore(cow.getName(), totalScore);
        }

        // หาวัวที่ชนะ
        Cow winner = findWinner();
        view.displayWinner(winner.getName());

        view.displayGameEnd();
    }

    private Cow findWinner() {
        Cow winner = cows[0];
        int highestScore = winner.calculateTotalScore();
        for (Cow cow : cows) {
            if (cow.calculateTotalScore() > highestScore) {
                winner = cow;
                highestScore = cow.calculateTotalScore();
            }
        }
        return winner;
    }
}
