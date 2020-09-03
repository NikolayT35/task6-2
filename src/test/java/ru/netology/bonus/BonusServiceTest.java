package ru.netology.bonus;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.bonus.BonusService;


import static org.junit.jupiter.api.Assertions.assertEquals;


class BonusServiceTest {

   @ParameterizedTest
   @CsvFileSource(resources = "/data.csv", delimiter = ';')
  public void calculate (String test, long amount, boolean registered, long expected) {
       BonusService service = new BonusService();
        long actual = service.calculate(amount, registered);
        assertEquals(expected, actual);
    }
}
//    @ParameterizedTest
//    @CsvFileSource(resources = "/country_code.csv", numLinesToSkip = 1)
//    void test_CsvFileSource(String country, int code) {
//        assertNotNull(country);
//        assertTrue(0 < code);
//    }
//}
//    @CsvSource(
//            value = {
//                    "'registered, under limit',100060,true,30",
//                    "'not registered, under limit',100060,false,10"
//            },
//            delimiter = ','
//    )
//    void shouldCalculate(String test, long amount, boolean registered, long expected) {
//        BonusService service = new BonusService();
//        long actual = service.calculate(amount, registered);
//        assertEquals(expected, actual);
//    }