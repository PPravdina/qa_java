import com.example.Cat;
import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    private Predator mockPredator;
    @Mock
    private Feline mockFeline;
    @InjectMocks
    private Cat cat;

    @Test
    public void testGetSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void testGetFood() throws Exception {
        // Настройка поведения мока перед вызовом метода cat.getFood()
        when(mockFeline.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        // Проверка результата
        assertEquals(List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }

    @Test(expected = Exception.class)
    public void testGetFoodThrowsException() throws Exception {
        // Настройка поведения мока перед вызовом метода cat.getFood()
        when(mockFeline.eatMeat()).thenThrow(new Exception("Неизвестный вид животного"));

        // Попытка вызвать метод, который должен выбросить исключение
        cat.getFood();
    }

}