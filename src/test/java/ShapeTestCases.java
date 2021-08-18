import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShapeTestCases {
    @Nested
    public class RectangleAreaTestCases {
        @Test
        void toCalculateAreaOfRectangleForPositiveLengthAndWidth() {
            ShapeCalculations shape = new ShapeCalculations(10, 5);
            assertEquals(50, shape.area());
        }

        @Test
        void toCalculateAreaOfRectangleForNegativeLengthAndWidth() {
            ShapeCalculations shape = new ShapeCalculations(-10, -5);
            assertEquals(50, shape.area());
        }

        @Test
        void toCalculateAreaOfRectangleForNegativeLengthAndPositiveWidth() {
            ShapeCalculations shape = new ShapeCalculations(-10, 5);
            assertEquals(-50, shape.area());
        }

        @Test
        void toCalculateAreaOfRectangleForPositiveLengthAndNegativeWidth() {
            ShapeCalculations shape = new ShapeCalculations(10, -5);
            assertEquals(-50, shape.area());
        }
    }

    @Nested
    public class RectanglePerimeterTestCases {
        @Test
        void toCalculatePerimeterOfRectangleForPositiveLengthAndWidth() {
            ShapeCalculations shape = new ShapeCalculations(10, 5);
            assertEquals(30, shape.perimeter());
        }

        @Test
        void toCalculatePerimeterOfRectangleForNegativeLengthAndWidth() {
            ShapeCalculations shape = new ShapeCalculations(-10, -5);
            assertEquals(-30, shape.perimeter());
        }

        @Test
        void toCalculatePerimeterOfRectangleForNegativeLengthAndPositiveWidth() {
            ShapeCalculations shape = new ShapeCalculations(-10, 5);
            assertEquals(-10, shape.perimeter());
        }

        @Test
        void toCalculatePerimeterOfRectangleForPositiveLengthAndNegativeWidth() {
            ShapeCalculations shape = new ShapeCalculations(10, -5);
            assertEquals(10, shape.perimeter());
        }
    }
}
