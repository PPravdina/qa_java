import com.example.Feline;
import com.example.Predator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    @Mock
    private Predator mockPredator;

    @InjectMocks
    private Feline feline;

    @Test
    public void testGetKittens() {
        Feline spyFeline = spy(new Feline());

        int kittensCount = spyFeline.getKittens();

        assertEquals(1, kittensCount);
    }

    @Test
    public void testGetKittensWithParameter() {
        Feline spyFeline = spy(new Feline());

        int kittensCount = spyFeline.getKittens(1);

        assertEquals(1, kittensCount);
    }

    @Test
    public void testEatMeat() throws Exception {
        // Act
        List<String> food = feline.eatMeat();

        // Assert
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test(expected = Exception.class)
    public void testUnknownAnimalKind() throws Exception {
        feline.getFood("Неизвестный вид");
    }

    @Test
    public void testGetFamily() {
        // Arrange
        Feline feline = new Feline();

        // Act
        String family = feline.getFamily();

        // Assert
        assertEquals("Кошачьи", family);
    }
}
