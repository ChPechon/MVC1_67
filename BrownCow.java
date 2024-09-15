public class BrownCow extends Cow {
    public BrownCow(String name) {
        super(name);
    }

    @Override
    public void playFrame(int frameIndex, int pinsLeft) {
        frames[frameIndex].play(pinsLeft);
    }
}
