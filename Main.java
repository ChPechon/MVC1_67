public class Main {
    public static void main(String[] args) {
        // สร้างวัว 3 ตัวจากแต่ละทีม
        Cow whiteCow = new WhiteCow("White Cow");
        Cow blackCow = new BlackCow("Black Cow");
        Cow brownCow = new BrownCow("Brown Cow");

        Cow[] cows = {whiteCow, blackCow, brownCow};

        // สร้าง View
        BowlingView view = new BowlingView();

        // สร้าง Controller
        BowlingController controller = new BowlingController(cows, view);

        // เริ่มเกม
        controller.startGame();
    }
}
