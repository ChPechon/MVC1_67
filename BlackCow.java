public class BlackCow extends Cow {
    public BlackCow(String name) {
        super(name);
    }

    @Override
    public void playFrame(int frameIndex, int pinsLeft) {
        frames[frameIndex].play(pinsLeft);

        // โอกาส 20% ที่วัวดำจะโกหกว่าล้มพินทั้งหมด (Strike)
        if (Math.random() < 0.2) {
            System.out.println(name + " lies about getting a Strike!");
            if (frames[frameIndex].getTotalPins() < 10) {
                System.out.println(name + " actually didn't knock down all pins. Setting to 0.");
                frames[frameIndex] = new BowlingFrame(); // ปรับการโยนเป็น 0
                frames[frameIndex].play(0); // ล้มพิน 0 ทั้งหมด
            }
        }
    }
}
