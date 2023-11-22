import com.example.AlexLion;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class AlexLionTest {
    @Mock
    private Feline mockFeline;
    @InjectMocks
    private AlexLion alexLion;

    @Test
    public void testGetFriends() throws Exception {
        assertEquals(List.of("Марти", "Глория", "Мелман"), alexLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        assertTrue(alexLion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        assertEquals(List.of("Животные", "Птицы", "Рыба"), alexLion.getFood());
    }
}
