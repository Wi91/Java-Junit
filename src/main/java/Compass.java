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
        // rotating right should advance point by 1 through list (North -> East -> South)


        for (int i = 0; i < Point.values().length - 1; i++) {

//            if (direction == Direction.RIGHT && point == Point.WEST){
//                return Point.NORTH;
            if (i  Point.values().length){
                i = i % Point.values().length;
            }
                if (direction == Direction.RIGHT) {
                currentPoint = Point.values()[i + 1];
               // System.out.println(currentPoint);


            }

        }
        return currentPoint;
    }
}


