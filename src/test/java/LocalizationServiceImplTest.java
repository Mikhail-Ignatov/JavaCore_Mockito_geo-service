import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.i18n.LocalizationService;
import ru.netology.i18n.LocalizationServiceImpl;

public class LocalizationServiceImplTest {
    @Test
    void locale() {
        LocalizationService localizationService = new LocalizationServiceImpl();

        String actual = localizationService.locale(Country.RUSSIA);
        String actual1 = localizationService.locale(Country.USA);
        String expected = "Добро пожаловать";
        String expected1 = "Welcome";

        Assertions.assertEquals(expected, actual);
        Assertions.assertEquals(expected1, actual1);
    }
}
