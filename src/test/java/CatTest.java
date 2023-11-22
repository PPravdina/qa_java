import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class CatTest {

    @Mock
    private Feline mockFeline;

    @InjectMocks
    private Cat cat;

    private List<String> expectedFood;

    @Before
    public void setUp() throws Exception {
        // Инициализируем моки
        MockitoAnnotations.initMocks(this);

        // Создаем ожидаемый список еды
        expectedFood = List.of("Животные", "Птицы", "Рыба");
    }

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        // Настройка поведения мока перед вызовом метода cat.getFood()
        when(mockFeline.eatMeat()).thenReturn(expectedFood);
        // Проверка результата
        assertEquals(expectedFood, cat.getFood());
    }

    @Test(expected = Exception.class)
    public void testGetFoodThrowsException() throws Exception {
        // Настройка поведения мока перед вызовом метода cat.getFood()
        when(mockFeline.eatMeat()).thenThrow(new Exception("Неизвестный вид животного"));

        // Попытка вызвать метод, который должен выбросить исключение
        cat.getFood();
    }

}