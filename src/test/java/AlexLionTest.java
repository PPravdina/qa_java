import com.example.AlexLion;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AlexLionTest {

    @Test
    public void testGetFriends() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertEquals(List.of("Марти", "Глория", "Мелман"), alexLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }

    @Test
    public void testGetKittens() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertTrue(alexLion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
        AlexLion alexLion = new AlexLion();
        assertEquals(List.of("Животные", "Птицы", "Рыба"), alexLion.getFood());
    }
}
