import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Created by jremes on 24/01/17.
 */
public class ArraysTest {

    @Test
    public void containsValTest() {
        Arrays tester = new Arrays();
        int[] haystack = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertEquals(true, tester.containsVal(haystack, 8));
        assertEquals(false, tester.containsVal(haystack, 12));
    }
}
