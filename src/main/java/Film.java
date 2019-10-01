public class Film {
    private String name;
    private Audio audio;
    private Subtitles subtitles;

    public Film(String name) {
        this.name = name;
    }

    public void setAudio(Audio audio) {
        this.audio = audio;
    }

    public void setSubtitles(Subtitles subtitles) {
        this.subtitles = subtitles;
    }

    @Override
    public String toString() {
        return "Film{\n" +
                "\tname='" + name + "\',\n" +
                "\taudio='" + audio + "\',\n" +
                "\tsubtitles='" + subtitles + "\'\n" +
                "}\n";
    }
}
