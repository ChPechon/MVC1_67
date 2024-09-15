// WhiteCow.java - คลาสสำหรับวัวขาว
public class WhiteCow extends Cow {
    public WhiteCow(String name) {
        super(name);
    }

    @Override
    public void playFrame(int frameIndex, int pinsLeft) {
        frames[frameIndex].play(pinsLeft);

        // โอกาส 10% ที่วัวขาวจะโกหกว่าโยนพลาดหมด (ถ่อมตัว)
        if (Math.random() < 0.1) {
            System.out.println(name + " lies about gutter ball!");
            if (frames[frameIndex].getTotalPins() > 0) {
                System.out.println(name + " actually hit some pins. Setting to Strike/Spare.");
                frames[frameIndex] = new BowlingFrame();
                frames[frameIndex].play(10); // ปรับเป็นการล้มพินทั้งหมด
            }
        }
    }
}
