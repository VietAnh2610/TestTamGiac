import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TriangleTypeTest {

    @Test
    public void testEquilateralTriangle() {
        String result = TriangleType.checkTriangleType(5, 5, 5);
        assertEquals("Equilateral", result);
    }

    @Test
    public void testIsoscelesTriangle() {
        String result = TriangleType.checkTriangleType(5, 5, 6);
        assertEquals("Isosceles", result);
    }

    @Test
    public void testScaleneTriangle() {
        String result = TriangleType.checkTriangleType(6, 4, 7);
        assertEquals("Scalene", result);
    }

    @Test
    public void testNotATriangle() {
        String result = TriangleType.checkTriangleType(0, 1, 2);
        assertEquals("NotATriangle", result);
    }

    @Test
    public void testRightTriangle() {
        String result = TriangleType.checkTriangleType(3, 4, 5);
        assertEquals("RightTriangle", result);
    }
}
