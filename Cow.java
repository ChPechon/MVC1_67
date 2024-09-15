public abstract class Cow {
    protected String name;
    protected BowlingFrame[] frames;

    public Cow(String name) {
        this.name = name;
        frames = new BowlingFrame[10]; // มี 10 รอบการเล่น
        for (int i = 0; i < 10; i++) {
            frames[i] = new BowlingFrame();
        }
    }

    public String getName() {
        return name;
    }

    public BowlingFrame getFrame(int frameIndex) {
        return frames[frameIndex];
    }

    public int calculateTotalScore() {
        int totalScore = 0;
        for (int i = 0; i < 10; i++) {
            totalScore += frames[i].getTotalPins();
        }
        return totalScore;
    }

    // ฟังก์ชันโยนโบว์ลิ่งที่สามารถปรับแต่งได้ในคลาสลูก
    public abstract void playFrame(int frameIndex, int pinsLeft);
}
