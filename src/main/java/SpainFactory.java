public class SpainFactory implements AbstractFactory {
    public Audio createAudio() {
        return new SpainAudio();
    }

    public Subtitles createSubtitles() {
        return new SpainSubtitles();
    }
}
