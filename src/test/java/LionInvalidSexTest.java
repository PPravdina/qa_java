import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

@RunWith(MockitoJUnitRunner.class)
public class LionInvalidSexTest {
    @Mock
    private Feline mockFeline;

    @Test
    public void testInvalidSexThrowsException() {
        try {
            new Lion("InvalidSex", mockFeline);
            fail("Ожидалось выбрасывание исключения, но оно не произошло.");
        } catch (Exception e) {
            assertEquals("Используйте допустимые значения пола животного - самей или самка", e.getMessage());
        }
    }
}
