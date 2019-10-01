public class Audio {
    String token;

    public Audio(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return token + " audio";
    }
}
