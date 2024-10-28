import java.util.ArrayList;

public class Compass {
    public enum Point {
        NORTH, EAST, SOUTH, WEST
    }

    public enum Direction {
        LEFT, RIGHT
    }

    Point currentPoint;
    //The value of currentPoint is defined in the for loop, which uses Point as an input

    public Point rotate(Point point, Direction direction) {
        // rotating right should advance point by 1 through list (North -> East -> South -> West)
        // rotating right from west -> North (Looping back around)

        if (direction == Direction.RIGHT && point == Point.NORTH) {
            return Point.EAST;
        }
            if (direction == Direction.RIGHT && point == Point.EAST) {
                return Point.SOUTH;
            }
                if (direction == Direction.RIGHT && point == Point.SOUTH) {
                    return Point.WEST;
                }
                    if (direction == Direction.RIGHT && point == Point.WEST) {
                        return Point.NORTH;
                    }

        if (direction == Direction.LEFT && point == Point.WEST) {
            return Point.SOUTH;
        }
        if (direction == Direction.LEFT && point == Point.SOUTH) {
            return Point.EAST;
        }
        if (direction == Direction.LEFT && point == Point.EAST) {
            return Point.NORTH;
        }
        if (direction == Direction.LEFT && point == Point.NORTH) {
            return Point.WEST;
        }

        return null;
                    }





                }




