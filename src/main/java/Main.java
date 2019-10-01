public class Main {

    static AbstractFactory factory;

    public static void main(String[] args) {
        Film film = new Film("Titanic");

        factory = FactoryType.getFactory(FactoryType.ENGLISH);

        film.setAudio(factory.createAudio());
        film.setSubtitles(factory.createSubtitles());

        System.out.println("User choose english audio");
        System.out.println(film);

        factory = FactoryType.getFactory(FactoryType.SPAIN);

        film.setAudio(factory.createAudio());
        film.setSubtitles(factory.createSubtitles());

        System.out.println("User choose spain subtitles");
        System.out.println(film);
    }
}
