import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static java.util.Collections.rotate;
import static org.junit.jupiter.api.Assertions.*;


public class CompassTest {

    @Test
    public void compassFacingNorthCanRotateRight() {
        //Arrange
        Compass compass = new Compass();
        //Act
       Compass.Point result = compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT);
        //Assert
        assertEquals(Compass.Point.EAST, result);

    }

    @Test
    @DisplayName("Test direction for all right values")
            public void compassCanPointToAllRightDirections() {
        Compass compass = new Compass();
assertAll(
        () -> assertEquals(Compass.Point.EAST, compass.rotate(Compass.Point.NORTH, Compass.Direction.RIGHT)),
        () -> assertEquals(Compass.Point.SOUTH, compass.rotate(Compass.Point.EAST, Compass.Direction.RIGHT)),
        () -> assertEquals(Compass.Point.WEST, compass.rotate(Compass.Point.SOUTH, Compass.Direction.RIGHT)),
        () -> assertEquals(Compass.Point.NORTH, compass.rotate(Compass.Point.WEST, Compass.Direction.RIGHT))
        );
    }
}