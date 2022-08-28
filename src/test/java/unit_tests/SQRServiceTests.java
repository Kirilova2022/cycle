package unit_tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTests {

    private SQRService sqrs = new SQRService();

    //Константы для тестов (пишутся с большой буквы и с final)
    private final int MIN_CHECKVAR = 200;
    private final int MAX_CHECKVAR = 300;

    @Test
    public void checkSQRService() {
        //Алгоритм проверки
        int expectedResult = 0;
        for(int i = 10; i < 100; i++) {
            int sqr = i*i;
            if ((MIN_CHECKVAR<sqr) && (sqr<MAX_CHECKVAR)) {
                expectedResult++;
            }
        }
        //Результат работы тестируемого метода
        //Чтобы уронить тест поменяйте местами диапазон здесь или прибавьте число к одной из границ
        int actualResult = sqrs.FindSqrOfRange(MIN_CHECKVAR,MAX_CHECKVAR);
        Assert.assertEquals(actualResult, expectedResult, "Количество возвращаемых квадратов не сходится!");
    }

}
