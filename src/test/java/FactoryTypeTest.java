import org.junit.Test;

import static org.junit.Assert.*;

public class FactoryTypeTest {
    @Test
    public void shouldReturnEnglishFactoryWhenInputIsEnglish() {
        String expected = new EnglishSubtitles().toString();
        String actual = FactoryType.getFactory(FactoryType.ENGLISH).createSubtitles().toString();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnSpainFactoryWhenInputIsSpain() {
        String expected = new SpainSubtitles().toString();
        String actual = FactoryType.getFactory(FactoryType.SPAIN).createSubtitles().toString();
        assertEquals(expected, actual);
    }
}