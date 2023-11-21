import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() throws Exception {
        feline = new Feline();
    }

    @Test
    public void testGetKittens() {
        int kittensCount = feline.getKittens();
        assertEquals(1, kittensCount);
    }

    @Test
    public void testGetKittensWithParameter() {
        int kittensCount = feline.getKittens(1);
        assertEquals(1, kittensCount);
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> food = feline.eatMeat();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), food);
    }

    @Test(expected = Exception.class)
    public void testUnknownAnimalKind() throws Exception {
        feline.getFood("Неизвестный вид");
    }

    @Test
    public void testGetFamily() {
        String family = feline.getFamily();
        assertEquals("Кошачьи", family);
    }
}
