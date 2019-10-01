public class EnglishFactory implements AbstractFactory {
    public Audio createAudio() {
        return new EnglishAudio();
    }

    public Subtitles createSubtitles() {
        return new EnglishSubtitles();
    }
}
