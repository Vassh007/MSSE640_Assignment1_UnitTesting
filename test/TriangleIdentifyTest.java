import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleIdentifyTest {
    @Test
    void testValidScaleneTriangle() {
        assertEquals("Scalene", TriangleIdentify.identifyTriangle(3, 4, 5));
    }

    @Test
    void testValidIsoscelesTriangle() {
        assertEquals("Isosceles", TriangleIdentify.identifyTriangle(5, 5, 7));
        assertEquals("Isosceles", TriangleIdentify.identifyTriangle(5, 7, 5));
        assertEquals("Isosceles", TriangleIdentify.identifyTriangle(7, 5, 5));
        assertEquals("Isosceles", TriangleIdentify.identifyTriangle(3, 3, 4));
        assertEquals("Isosceles", TriangleIdentify.identifyTriangle(3, 4, 3));
        assertEquals("Isosceles", TriangleIdentify.identifyTriangle(4, 3, 3));
    }

    @Test
    void testValidEquilateralTriangle() {
        assertEquals("Equilateral", TriangleIdentify.identifyTriangle(5, 5, 5));
        assertEquals("Equilateral", TriangleIdentify.identifyTriangle(10, 10, 10));
        assertEquals("Equilateral", TriangleIdentify.identifyTriangle(2, 2, 2));
    }

    @Test
    void testInvalidTriangleZeroLengthSide() {
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(0, 0, 0));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(0, 1, 2));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 0, 2));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 2, 0));
    }
    @Test
    void testInvalidTriangleNegativeSide() {
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(-1, -1, -1));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(-1, 1, 2));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, -1, 2));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 2, -1));
    }

    @Test
    void testTriangleInequalityViolation() {
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 1, 3));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(1, 3, 1));
        assertEquals("Invalid", TriangleIdentify.identifyTriangle(3, 1, 1));
    }
}
