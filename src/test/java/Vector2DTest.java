import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * Методы сложные необходимо тестировать в отдельном тестовом методе,
 * т.к если будет ошибка - остальная часть проверена не будет.
 *
 * Хорошая практика - каждый метод тестировать в отдельном
 */
public class Vector2DTest {
    private final double EPS = 1e-9;
    private Vector2D v1;
    private static Vector2D v2;

    @BeforeClass // Вектор для всего класса, статический оъбект будут делить все методы
    public static void createNewVector2(){
        v2 = new Vector2D();
    }

    @Before // До выполнения метода, для создания окружения для тестирования
    public void createNewVector(){ // Создаем метод по созданию нового объекта для каждого теста
        v1 = new Vector2D(); // действие
    }

    @Test
    public void newVectorShouldHaveZeroLength(){
        // assertion
        // Ожидает ожидаемую величину, 2й аргумент - ожидает фактический результат, 3 - дельта (точность)
        // double немного могут отличаться, дельту сделали 0.000...0001
        Assert.assertEquals(0, v1.length(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX(){
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroY(){
        Assert.assertEquals(0, v1.getY(), EPS);
    }

//    @Test
//    public void newVectorShouldHaveZeroXAndYZero(){
//        Assert.assertEquals(0, v1.getX(), EPS);
//        Assert.assertEquals(0, v1.getY(), EPS);
//    }
}
