import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(Parameterized.class)
public class LionTest {

    private final String sex;
    private final boolean expectedHasMane;

    public LionTest(String sex, boolean expectedHasMane) {
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false},
                // Дополнительные тестовые данные могут быть добавлены здесь
        });
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion(sex, mockFeline);

        assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @Test(expected = Exception.class)
    public void testInvalidSex() throws Exception {
        // Ожидается, что при передаче недопустимого значения пола выбросится исключение
        new Lion("Используйте допустимые значения пола животного - самей или самка", mock(Feline.class));
    }

    @Test
    public void testGetKittens() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion(sex, mockFeline);

        when(mockFeline.getKittens()).thenReturn(1); // Устанавливаем ожидаемое количество котят

        assertEquals(1, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Feline mockFeline = mock(Feline.class);
        Lion lion = new Lion(sex, mockFeline);

        when(mockFeline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        assertEquals(List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
