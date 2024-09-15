public class BowlingFrame {
    private int firstThrow;
    private int secondThrow;
    private boolean isStrike;
    private boolean isSpare;

    // โยนโบว์ลิ่งในแต่ละรอบ
    public void play(int pinsLeft) {
        firstThrow = (int) (Math.random() * (pinsLeft + 1)); // โยนครั้งแรก
        if (firstThrow == 10) {  // ถ้าล้มทั้ง 10 พิน
            isStrike = true;     // เป็น Strike
            secondThrow = 0;
        } else {
            secondThrow = (int) (Math.random() * (pinsLeft - firstThrow + 1)); // โยนครั้งที่สอง
            isSpare = (firstThrow + secondThrow == 10); // ถ้าล้มพินทั้งหมดในสองครั้ง เป็น Spare
        }
    }

    public int getFirstThrow() {
        return firstThrow;
    }

    public int getSecondThrow() {
        return secondThrow;
    }

    public int getTotalPins() {
        return firstThrow + secondThrow;
    }

    public boolean isStrike() {
        return isStrike;
    }

    public boolean isSpare() {
        return isSpare;
    }
}