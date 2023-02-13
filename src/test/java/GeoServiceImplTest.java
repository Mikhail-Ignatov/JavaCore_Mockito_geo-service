import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;
import ru.netology.entity.Location;
import ru.netology.geo.GeoService;
import ru.netology.geo.GeoServiceImpl;


public class GeoServiceImplTest {

    @Test
    void testsByIp() {

        GeoService geoService = new GeoServiceImpl();
        String actualIp = "172.";

        Location expected = new Location("Moscow", Country.RUSSIA, null, 0);

        Location actual = geoService.byIp(actualIp);

        Assertions.assertEquals(expected.getCity(), actual.getCity());
        Assertions.assertEquals(expected.getCountry(), actual.getCountry());
        Assertions.assertEquals(expected.getStreet(), actual.getStreet());
        Assertions.assertEquals(expected.getBuiling(), actual.getBuiling());
    }

}
