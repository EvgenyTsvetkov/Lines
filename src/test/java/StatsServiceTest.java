import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void testSum() {
        StatService service = new StatService();
        long[] sales = { 8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18 };

        long actual = service.belowAverage(sales);
        long expected = 0;

        Assertions.assertEquals(expected, actual);
        }
    }

