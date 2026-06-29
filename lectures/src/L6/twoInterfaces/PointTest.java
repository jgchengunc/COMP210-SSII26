package L6.twoInterfaces;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class PointTest {
    private Point p;

    @BeforeEach
    public void setup() {
        p = new CartesianPoint(1.0, 2.0);
    }

    @Test
    public void simple() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testNotNull() {
        assertNotNull(p);
    }

    @Test
    public void testGetX() {
        assertEquals(1.0, p.getX(), 0.001);
    }

    @Test
    public void testIsInQ1() {
        assertTrue(p.getX() > 0.0 && p.getY() > 0.0);
    }
}
